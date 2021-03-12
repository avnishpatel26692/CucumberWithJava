package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgeSubmittedPage {

    @FindBy(id = "message")
    private WebElement messageText;

    public String getMessage(){
        return messageText.getText();
    }

}
