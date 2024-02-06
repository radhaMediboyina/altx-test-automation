package au.com.altx.utils;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

@Log4j2
public class WebDriverFactory {
    public static WebDriver createWebDriver() {
        String webDriver = System.getProperty("browser", "chrome");
        String windowSize = System.getProperty("window-size", "1920,1200");
        switch(webDriver) {
            case "firefox":
                return new FirefoxDriver();
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-gpu", "--window-size=" + windowSize,
                        "--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage","--remote-allow-origins=*");
                return new ChromeDriver(options);
            default:
                throw new RuntimeException("Unsupported webDriver: " + webDriver);
        }
    }


    
}
