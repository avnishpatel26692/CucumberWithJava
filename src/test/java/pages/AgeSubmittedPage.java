package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AgeSubmittedPage {

    @FindBy (how=How.ID, using = "message")
    private WebElement message;

    public String getMessage(){
        return message.getText();
    }
}
