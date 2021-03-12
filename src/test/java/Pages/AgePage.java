package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgePage {
    @FindBy(how = How.ID, using = "name")
    private WebElement nameText;

    @FindBy(how = How.NAME, using = "age")
    private WebElement ageText;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submitBtn;

    public String  agePageURL = "https://kristinek.github.io/site/examples/age";



    public void enterName(String name){
        nameText.clear();
        nameText.sendKeys();
    }

    public void enterAge (String age){
        ageText.sendKeys();
    }

    public void clickOnSubmitBtn(){
        submitBtn.sendKeys();
    }
}
