package stepDefinitions;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.sql.Driver.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class NumbersCheckSteps {
    private WebDriver driver;

    public NumbersCheckSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^User navigate to Number page$")
    public void user_navigate_to_Number_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");

    }

    @When("^User enter number: (\\d+)$")
    public void user_enter_number(int arg1) throws Throwable {
        WebElement enterNumber = driver.findElement(By.id("numb"));
        enterNumber.sendKeys(""+arg1);
    }


    @Then("^appear message : \"([^\"]*)\"$")
    public void appear_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1,driver.findElement(By.id("ch1_error")).getText());
    }

    @When("^User enter number 101: (\\d+)$")
    public void user_enter_number2(int arg2) throws Throwable {
        WebElement enterNumber = driver.findElement(By.id("numb"));
        enterNumber.sendKeys(""+arg2);
    }

    @When("^click on Submit Button$")
    public void click_on_Submit_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       WebElement subButton = driver.findElement(By.cssSelector("button"));
       subButton.click();
    }


    @When("^User enter number 81: (\\d+)$")
    public void user_enter_number_81(int arg3) throws Throwable {
        WebElement enterNumber = driver.findElement(By.id("numb"));
        enterNumber.sendKeys(""+arg3);
    }

    @Then("^appear text : \"([^\"]*)\"$")
    public void appear_text(String arg1) throws Throwable {
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(arg1,alert.getText());
    }

}
