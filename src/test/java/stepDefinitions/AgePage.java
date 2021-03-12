package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AgePage {

    public final String url = "https://kristinek.github.io/site/examples/age";

    @FindBy(id = "name")
    private WebElement nameText;

    @FindBy(id = "age")
    private WebElement ageText;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public void setName(String s){
        nameText.clear();
        nameText.sendKeys(s);
    }

    public void setAge(int s){
        ageText.clear();
        ageText.sendKeys(String.valueOf(s));
    }

    public void clickSubmit(){
        submitButton.click();
    }

}
