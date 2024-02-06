package au.com.altx.steps.login;

import au.com.altx.components.Scrolling;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import au.com.altx.utils.GlueCommon;
import au.com.altx.screens.login.LoginScreen;

@Log4j2
public class LoginStepDefinition {

    private final GlueCommon glueCommon;
    private final Scrolling scroll;
    private final LoginScreen LoginScreen;

    public LoginStepDefinition(GlueCommon glueCommon) {
        this.glueCommon = glueCommon;
        this.LoginScreen= new LoginScreen(glueCommon.getDriver());
        this.scroll= new Scrolling(glueCommon.getDriver());
    }

    @Given("I visit the iCapture login screen")
    public void iVisitTheICaptureLoginScreen() throws InterruptedException {
        glueCommon.getDriver().get(System.getProperty("host2"));
        Thread.sleep(5000);
    }

    @When("I enter username {string} on ICapture portal")
    public void iEnterUsernameOnICapturePortal(String Username) throws InterruptedException {
        LoginScreen.enteringUserName(Username);
    }

    @When("I enter password {string} on ICapture portal")
    public void iEnterPasswordOnICapturePortal(String Password) throws InterruptedException {
        LoginScreen.enteringPassword(Password);
    }

    @Then("I click on login button")
    public void iClickOnLoginButton() {
        LoginScreen.loginButton();
    }
}
