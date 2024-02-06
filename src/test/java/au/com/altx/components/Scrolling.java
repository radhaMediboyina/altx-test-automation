package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Log4j2
public class Scrolling {

    private final WebDriver driver;

    public Scrolling(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollDown(int pixelHeight) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // This  will scroll down the page by pixel vertical
        js.executeScript("window.scrollBy(0,"+pixelHeight+")");
    }

    public void scrollDown(int pixelHeight, int waitDuration) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        // This  will scroll down the page by pixel vertical
        js.executeScript("window.scrollBy(0,"+pixelHeight+")");
        Thread.sleep(waitDuration);
    }

    public void scrollToElement(WebElement Element,int waitDuration) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(waitDuration);
    }

    public void scrollToElement(WebElement Element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", Element);
    }

    public void scrollToElement(WebElement Element,int beforeWait,int afterWait) throws InterruptedException {
        Thread.sleep(beforeWait);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(afterWait);
    }

}
