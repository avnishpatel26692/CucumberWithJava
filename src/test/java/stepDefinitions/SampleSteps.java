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

public class SampleSteps {
    private WebDriver driver;

    public SampleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() throws Throwable {
        driver.get("https://kristinek.github.io/site");
    }

    @Then("^I should see home page header$")
    public void iShouldSeeHomePageHeader() throws Throwable {
        assertEquals("This is a home page",
                driver.findElement(By.cssSelector("h1")).getText());
    }

    @And("^I should see home page description$")
    public void iShouldSeeHomePageDescription() throws Throwable {
        assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
                driver.findElement(By.cssSelector("p")).getText());
    }

    @And("^I should see menu$")
    public void iShouldSeeMenu() throws Throwable {
        assertTrue(driver.findElement(By.className("w3-navbar")).isDisplayed());
    }

    @When("^User navigates to Link Page$")
    public void user_navigates_to_Link_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/po");
        throw new PendingException();
    }

    @Then("^User should verify if page is open correctly$")
    public void user_should_verify_if_page_is_open_correctly() throws Throwable {
        Assert.assertEquals("Lorem ipsum",driver.findElement(By.xpath("//h1[text()='Lorem ipsum']")));
        throw new PendingException();
    }
        ///AgeScenario
    @Given("^User navigates to Age page$")
    public void user_navigates_to_Age_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^User enters name : \"([^\"]*)\"$")
    public void user_enters_name(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(arg1);
    }

    @When("^User enters age : \"([^\"]*)\"$")
    public void user_enters_age(String arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.name("age"));
        ageText.sendKeys(arg1);
    }

    @When("^User clicks on Submit button$")
    public void user_clicks_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();

    }

    @Then("^User receives Hello message$")
    public void user_receives_Hello_message() throws Throwable {
        Assert.assertEquals("Hello, Egils, you are an adult",driver.findElement(By.id("message")).getText());
    }


    @Given("^User(\\d+) navigates to Age page$")
    public void user2_navigates_to_Age_page(int arg1) throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");
        throw new PendingException();
    }

    @When("^User2 enters name : \"([^\"]*)\"$")
    public void user2_enters_name(String arg2) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(arg2);
    }

    @When("^User2 enters age : \"([^\"]*)\"$")
    public void user2_enters_age(String arg2) throws Throwable {
        WebElement ageText = driver.findElement(By.name("age"));
        ageText.sendKeys(arg2);
    }

    @When("^User2 clicks on Submit button$")
    public void user2_clicks_on_Submit_button(int arg1) throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User2 receives Hello message$")
    public void user2_receives_Hello_message(int arg1) throws Throwable {
        Assert.assertEquals("Hello, Emils, you are a kid",driver.findElement(By.id("message")).getText());
    }

}



