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

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;


public class SampleSteps2 {
    private WebDriver driver;

    public SampleSteps2() {
        this.driver = Hooks.driver;
    }

    @When("^user navigates to Link Page$")
    public void user_navigates_to_Link_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/po");

    }

    @Then("^user should verify the page is opened correctly$")
    public void user_should_verify_the_page_is_opened_correctly() throws Throwable {
        Assert.assertEquals("https://kristinek.github.io/site/examples/po", driver.getCurrentUrl());

    }

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age.html");
        Assert.assertEquals("https://kristinek.github.io/site/examples/age.html", driver.getCurrentUrl());
    }

    @When("^User enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(arg1);
    }

    @When("^User enter age : \"([^\"]*)\"$")
    public void user_enter_age(String arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.id("age"));
        ageText.sendKeys(arg1);
    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        Assert.assertEquals("Hello, Nancy, you are an adult", driver.findElement(By.id("message")).getText());
    }
}
