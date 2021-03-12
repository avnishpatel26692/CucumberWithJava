package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgePO {
    @FindBy(how = How.ID, using = "name")
    WebElement nameField;

    @FindBy(how = How.ID, using = "age")
    WebElement ageField;

    @FindBy(how = How.ID, using = "submit")
    WebElement submitBtn;

    public String ageUrl = "https://kristinek.github.io/site/examples/age";

    public void enterName(String name){
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterAge(String age){
        ageField.sendKeys(age);
    }

    public void clickSubmitBtn(){
        submitBtn.click();
    }

}
