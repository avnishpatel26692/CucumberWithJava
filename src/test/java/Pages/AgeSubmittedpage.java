package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgeSubmittedpage {

    @FindBy(how = How.ID, using = "message")
    private WebElement message;

    public String getMessage() {
        return message.getText();
    }
}

