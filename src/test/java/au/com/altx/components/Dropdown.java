package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@Log4j2
public class Dropdown {
    public void dropdownSelectByText(WebElement elementPath, String elementText){
        Select s = new Select(elementPath);
        s.selectByVisibleText(elementText);
    }
    public void dropdownSelectByText(WebElement elementPath, String elementText,int waitDuration) throws InterruptedException {
        Select s = new Select(elementPath);
        s.selectByVisibleText(elementText);
        Thread.sleep(waitDuration);
    }
    public void dropdownSelectByText(int beforeDuration,WebElement elementPath, String elementText,int afterDuration) throws InterruptedException {
        Thread.sleep(beforeDuration);
        Select s = new Select(elementPath);
        s.selectByVisibleText(elementText);
        Thread.sleep(afterDuration);
    }
    public void dropdownSelectByValue(WebElement elementPath, String elementValue){
        Select s = new Select(elementPath);
        s.selectByValue(elementValue);
    }
    public void dropdownSelectByValue(WebElement elementPath, String elementValue,int waitDuration) throws InterruptedException {
        Select s = new Select(elementPath);
        s.selectByValue(elementValue);
        Thread.sleep(waitDuration);
    }
    public void dropdownSelectByValue(int beforeDuration,WebElement elementPath, String elementValue,int afterDuration) throws InterruptedException {
        Thread.sleep(beforeDuration);
        Select s = new Select(elementPath);
        s.selectByValue(elementValue);
        Thread.sleep(afterDuration);
    }
    public void dropdownSelectByIndex(WebElement elementPath, int elementIndex){
        Select s = new Select(elementPath);
        s.selectByIndex(elementIndex);
    }
    public void dropdownSelectByIndex(int beforeWait,WebElement elementPath, int elementIndex) throws InterruptedException {
        Thread.sleep(beforeWait);
        Select s = new Select(elementPath);
        s.selectByIndex(elementIndex);
    }
    public void dropdownSelectByIndex(WebElement elementPath, int elementIndex,int waitDuration) throws InterruptedException {
        Select s = new Select(elementPath);
        s.selectByIndex(elementIndex);
        Thread.sleep(waitDuration);
    }
    public void dropdownSelectByIndex(int beforeDuration, WebElement elementPath, int elementIndex,int afterDuration) throws InterruptedException {
        Thread.sleep(beforeDuration);
        Select s = new Select(elementPath);
        s.selectByIndex(elementIndex);
        Thread.sleep(afterDuration);
    }
}
