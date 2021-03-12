package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgeSubmittedPage {

    @FindBy (how=How.ID, using="message")
    WebElement msg;
    public String getMessage()
    {
        return msg.getText();
    }
}
