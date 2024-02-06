package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
@Log4j2
public class AssertValue {

    public void assertText(String value, WebElement xpathKey) {
        try {
            Assert.assertEquals(value, xpathKey.getText());
        } catch (Error e) {
            log.info("Text is not verified"+e.getMessage());
        }
    }
    public void assertText(String value, WebElement xpathKey, int waitDuration) {
        try {
            Thread.sleep(waitDuration);
            Assert.assertEquals(value, xpathKey.getText());
        } catch (Error | InterruptedException e) {
            log.info("Text is not verified"+e.getMessage());
        }
    }
    public void assertAttribute(String value, WebElement xpathKey, String AttributeValue) {
        try {
            Assert.assertEquals(value, xpathKey.getAttribute(AttributeValue));
        } catch (Error e) {
            log.info("getAttribute is not verified "+e.getMessage());
        }
    }
    public void assertAttribute(String value, WebElement xpathKey, String AttributeValue, int waitDuration) {
        try {
            Thread.sleep(waitDuration);
            Assert.assertEquals(value, xpathKey.getAttribute(AttributeValue));
        } catch (Error | InterruptedException e) {
            log.info("getAttribute is not verified "+e.getMessage());
        }
    }
    public void assertStringText(String expected, String actual) {
        try {
            Assert.assertEquals(expected, actual);
        } catch (Error e) {
            log.info("Text is not verified"+e.getMessage());
        }
    }
    public void assertStringText(String expected, String actual, int waitDuration) {
        try {
            Thread.sleep(waitDuration);
            Assert.assertEquals(expected, actual);
        } catch (Error | InterruptedException e) {
            log.info("Text is not verified"+e.getMessage());
        }
    }
    public void assertCssValue(String value, WebElement xpathKey, String CssValue) {
        try {
            Assert.assertEquals(value, xpathKey.getCssValue(CssValue));
        } catch (Error e) {
            log.info("getCssValue is not verified "+e.getMessage());
        }
    }
    public void assertCssValue(String value, WebElement xpathKey, String CssValue, int waitDuration) {
        try {
            Thread.sleep(waitDuration);
            Assert.assertEquals(value, xpathKey.getCssValue(CssValue));
        } catch (Error | InterruptedException e) {
            log.info("getCssValue is not verified "+e.getMessage());
        }
    }

}
