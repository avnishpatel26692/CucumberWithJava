package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class AgePage {



    @FindBy(how = How.ID, using = "name")
    private WebElement nameText;

    @FindBy(how = How.NAME, using = "age")
    private WebElement ageText;

    @FindBy(how = How.ID, using = "submit")
    private WebElement submitBtn;

    public String agePageURL = "https://kristinek.github.io/site/examples/age";

    public void enterName(String name)
    {
        nameText.clear();
        nameText.sendKeys(name);
}
     public void enterAge(String age)
     {
         ageText.sendKeys(age);
     }
     public void clickonSubmitBtn()
    {
        submitBtn.click();
    }

    private class Public {
    }
}