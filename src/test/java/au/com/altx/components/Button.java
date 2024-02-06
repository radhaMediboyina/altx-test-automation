package au.com.altx.components;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
@Log4j2
public class Button {

    public void buttonStatus(WebElement ButtonAddress){
        log.info(ButtonAddress.getAttribute("class"));
        boolean buttonByDefault = ButtonAddress.isEnabled();
        if(buttonByDefault){
            log.info(ButtonAddress+" button is enabled");
        }
        else
        {
            log.info(ButtonAddress+" button is disabled");
        }

    }

}
