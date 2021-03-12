package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgePage {

    @FindBy(how= How.ID,using="name")
    private WebElement nameField;

    @FindBy(how= How.ID,using="age")
    private WebElement ageField;

    @FindBy(how= How.ID,using="submit")
    private WebElement submitBtn;

public void enterName(String name){
    nameField.clear();
    nameField.sendKeys(name);
}
public void enterAge(String age){
    ageField.sendKeys("" +age);

}
public void clickSubmitbtn(){
     submitBtn.click();
}
public String agePageLink = "https://kristinek.github.io/site/examples/age";
}
