package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgeSubmittedPage {

        @FindBy(how = How.ID, using = "message")
        WebElement message;

        public String getMessage(){
            return message.getText();
        }


}
