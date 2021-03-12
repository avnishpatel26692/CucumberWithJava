package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgePage {
    @FindBy(how = How.ID, using = "name")
    WebElement nameText;

    @FindBy(how = How.ID, using = "age")
    WebElement nameAge;

    @FindBy(how = How.ID, using = "submit")
    WebElement submitBtn;


    public String agePageUrl = "https://kristinek.github.io/site/examples/age.html" ;

    public void enterName(String name) {
        nameText.clear();
        nameText.sendKeys();
    }

    public void enterAge (String age) {
        nameAge.sendKeys(age);
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();

    }




}


