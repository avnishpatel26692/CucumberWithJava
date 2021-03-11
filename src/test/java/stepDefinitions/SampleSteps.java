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

    @When("^User navigate to link Page$")
    public void user_navigate_to_link_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^User should verify page is opened correctly$")
    public void user_should_verify_page_is_opened_correctly() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^User navigate to Age Page$")
    public void user_navigate_to_Age_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       this.driver.get("https://kristinek.github.io/site/examples/age");
        //throw new PendingException();
    }

    @When("^user enter name:\"([^\"]*)\"$")
    public void user_enter_name(String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement nameText = this.driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(new CharSequence[]{arg2});
        //throw new PendingException();
    }

    @When("^user enter age: (\\d+)$")
    public void user_enter_age(String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement ageText = this.driver.findElement(By.name("age"));
        ageText.sendKeys(new CharSequence[]{arg2});
        // throw new PendingException();
    }

    @When("^click on submit button$")
    public void click_on_submit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.driver.findElement(By.id("submit")).click();
        //throw new PendingException();
    }

    @Then("^user see message: \"([^\"]*)\"$")
    public void user_see_message(String arg) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg, this.driver.findElement(By.id("message")).getText());
        //throw new PendingException();
    }

    @Given("^I am on number page$")
    public void i_am_on_number_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
        //throw new PendingException();
    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void i_enter_number(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement ageText = this.driver.findElement(By.id("numb"));
        ageText.sendKeys(new CharSequence[]{arg1});
        //throw new PendingException();
    }

    @When("^I click submit number$")
    public void i_click_submit_number() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement submitButton = this.driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button"));
        submitButton.click();
        //throw new PendingException();
    }

    @Then("^I see a message: \"([^\"]*)\"$")
    public void i_see_a_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement messageText = this.driver.findElement(By.id("ch1_error"));
        Assert.assertEquals(arg1, messageText.getText());
        //throw new PendingException();
    }

    @Then("^I see a new message: \"([^\"]*)\"$")
    public void i_see_a_new_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        Assert.assertEquals(arg1, message);
        //throw new PendingException();
    }
}



