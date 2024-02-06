package au.com.altx.screens.login;

import au.com.altx.components.*;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class LoginScreen {


    public LoginScreen(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.scroll= new Scrolling(driver);
        this.clickElement = new Click(driver);
    }

    private final WebDriver driver;
    private final Scrolling scroll;
    private final Click clickElement;

    AssertValue verifyText = new AssertValue();
    Input input = new Input();

    @FindBy(id = "login-username")
    private WebElement userName_signInScreen;

    @FindBy(id = "login-password")
    private WebElement password_signInScreen;

    @FindBy(name = "btnSignIn")
    private WebElement button_signInScreen;

    public void enteringUserName(String userName) throws InterruptedException {
        input.inputText(userName_signInScreen,userName,3000);
        log.info("username is entered");
    }
    public void enteringPassword(String password) throws InterruptedException {
        input.inputText(password_signInScreen,password,2000);
        log.info("password is entered");
    }
    public void loginButton(){
        clickElement.clickingElement(button_signInScreen,6000);
        log.info("Login In button is clicked");
    }
}
