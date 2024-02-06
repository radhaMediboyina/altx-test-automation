package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

@Log4j2
public class Input{

    public void inputText(WebElement inputPath, String value){
        try{
        inputPath.click();
        inputPath.clear();
        inputPath.sendKeys(value);
        }catch (Error e) {
            log.info("Value is not entered in input field "+e.getMessage());
        }

    }
    public void inputText(WebElement inputPath, String value,int waitDuration) throws InterruptedException {
        try {
            inputPath.click();
            inputPath.clear();
            Thread.sleep(waitDuration);
            inputPath.sendKeys(value);
        }catch (Error e) {
            log.info("Value is not entered in input field "+e.getMessage());
        }
    }
    public void fieldClassValue(WebElement locatorPath, String ActualClass){
        try {
            String attributeValue = locatorPath.getAttribute("class");
            Assert.assertEquals(attributeValue, ActualClass);
            String cssValue = locatorPath.getCssValue("border-left-color");

        }catch (Error e){
            log.info("Field class value is not fetched "+e.getMessage());
        }
    }

    public void inputWithoutClear(WebElement inputPath, String value,int waitDuration) throws InterruptedException {
        try {
            inputPath.click();
            Thread.sleep(waitDuration);
            inputPath.sendKeys(value);
        }catch (Error e) {
            log.info("Value is not entered in input field "+e.getMessage());
        }
    }

    public void inputClear(WebElement inputPath){
        try{
            inputPath.click();
            inputPath.clear();
        }catch (Error e) {
            log.info("clearing the input field "+e.getMessage());
        }

    }

}
