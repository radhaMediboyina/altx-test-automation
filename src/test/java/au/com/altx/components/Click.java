package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class Click {

    private final WebDriver driver;
    public Click(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickingElement(WebElement buttonClick){
        try{
            buttonClick.click();
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }
    public void clickingElement(WebElement buttonClick,int waitDuration){
            try{
                buttonClick.click();
                Thread.sleep(waitDuration);
            }catch (Exception e){
                log.info(e.getMessage());
            }
    }

    public void jsClick(WebElement element,int waitDuration){
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            Thread.sleep(waitDuration);
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }

    public void clickingElement(WebElement buttonClick,int beforeWait, int afterWait){
        try{
            Thread.sleep(beforeWait);
            buttonClick.click();
            Thread.sleep(afterWait);
        }catch (Exception e){
            log.info(e.getMessage());
        }
    }

}
