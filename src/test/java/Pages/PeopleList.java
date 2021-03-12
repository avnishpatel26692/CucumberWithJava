package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PeopleList {
    @FindBy(how = How.ID, using = "addPersonBtn")
    private WebElement addPersonButton;

    public void clickAddPersonButton(){
        addPersonButton.click();
    }
}
