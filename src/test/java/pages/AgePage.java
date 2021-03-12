package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AgePage {
    private final String agePageURL = "https://kristinek.github.io/site/examples/age";

    @FindBy(how = How.ID, using = "name")
    private WebElement nameInput;

    @FindBy(how = How.ID, using = "age")
    private WebElement ageInput;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submitBtn;

    @FindBy(how = How.ID, using = "error")
    private WebElement errorMsg;

    @FindBy(how = How.ID, using = "message")
    private WebElement ageMsg;

    public void enterNameInput(String value) {
        nameInput.clear();
        nameInput.sendKeys(value);
    }

    public void enterAgeInput(String value) {
        ageInput.clear();
        ageInput.sendKeys(value);
    }

    public void clickSubmitBtn() {
        submitBtn.click();
    }

    public void verifyMessage(String expectedResult) {
        Assert.assertEquals(expectedResult, ageMsg.getText());
    }

    public String getAgePageURL() {
        return agePageURL;
    }
}
