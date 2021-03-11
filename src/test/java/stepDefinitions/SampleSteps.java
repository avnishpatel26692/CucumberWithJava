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

    @Given("^user open facebook page$")
    public void user_open_facebook_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user should be logged in successfully$")
    public void user_should_be_logged_in_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^user can logout$")
    public void user_can_logout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user navigates to Link Page$")
    public void user_navigates_to_Link_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/po");
    }

    @Then("^user should verify page is opened correctly$")
    public void user_should_verify_page_is_opened_correctly() throws Throwable {
        Assert.assertEquals("Lorem ipsum", driver.findElement(By.xpath("//h1[text()='Lorem ipsum']")).getText());

    }
    @Given("^user navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age.html");
    }

    @When("^user enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.name("name"));
        nameText.clear();
        nameText.sendKeys(arg1);
    }

    @Then("^user enters age : (\\d+)$")
    public void user_enters_age(int arg1) throws Throwable {
       WebElement nameText = driver.findElement(By.name("age"));
       nameText.sendKeys(""+arg1);
    }

    @Then("^click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^user see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }




}



