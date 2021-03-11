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
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }

    @Then("^user should verify page is opened correctly$")
    public void user_should_verify_page_is_opened_correctly() throws Throwable {

    Assert.assertEquals("Lorem ipsum", driver.findElement(By.xpath("//h1[text()='Lorem ipsum']")).getText());
    }


    @Given("^User navigates to Age page$")
    public void user_navigates_to_Age_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age.html");
    }

    @When("^User enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
        WebElement nameField = driver.findElement(By.name("name"));
        nameField.clear();
        nameField.sendKeys(arg1);
    }

    @When("^user enter Age : \"([^\"]*)\"$")
    public void user_enter_Age(int arg1) throws Throwable {
        WebElement ageField = driver.findElement(By.name("age"));
        ageField.sendKeys(""+ arg1);
    }

    @When("^Click on submit button$")
    public void click_on_submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();

    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
       Assert.assertEquals(arg1,driver.findElement(By.id("message")).getText());


    }










    @Given("^I am on number page$")
    public void i_am_on_number_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void i_enter_number(String arg1) throws Throwable {
        WebElement numberField = driver.findElement(By.id("numb"));
        numberField.sendKeys(arg1);
    }

    @When("^I click submit number$")
    public void i_click_submit_number() throws Throwable {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("^I see a message: \"([^\"]*)\"$")
    public void i_see_a_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1,driver.findElement(By.id("ch1_error")).getText());
    }
    @Then("^I see a new message: \"([^\"]*)\"$")
    public void i_see_a_new_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1,driver.switchTo().alert().getText());
    }


    }

















