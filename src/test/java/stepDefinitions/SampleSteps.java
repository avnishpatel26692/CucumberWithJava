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

    }

    @When("^user enters username and password$")
    public void user_enters_username_and_password() throws Throwable {

    }

    @When("^user clicks on login button$")
    public void user_clicks_on_login_button() throws Throwable {

    }

    @Then("^user should be logged successfully$")
    public void user_should_be_logged_successfully() throws Throwable {

    }

    @Then("^user can logout$")
    public void user_can_logout() throws Throwable {

    }

    @And("^user is on home page$")
        public void userOnHomePage() throws Throwable {
        throw new PendingException();
    }

    @When("^User navigates to link page$")
    public void userNavigatesToLinkPage() {
        driver.get("https://kristinek.github.io/site/examples/po");
    }

    @Then("^User should verify page is opened correctly$")
    public void userShouldVerifyPageIsOpenedCorrectly() {
        Assert.assertEquals("Lorem ipsum",driver.findElement(By.xpath("//h1[text()='Lorem ipsum']")).getText());
    }

    @Given("^User navigates to Age page$")
    public void userNavigatesToAgePage() {
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^user enter name : \"([^\"]*)\"$")
    public void userEnterName(String arg1) throws Throwable {
       WebElement nameText = driver.findElement(By.id("name"));
       nameText.clear();
       nameText.sendKeys(arg1);
    }

    @And("^user enter age : \"([^\"]*)\"$")
    public void userEnterAge(int arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.id("age"));
        ageText.sendKeys("" +arg1);

    }

    @And("^click Submit button$")
    public void clickSubmitButton() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^user see message : \"([^\"]*)\"$")
    public void userSeeMessage(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());

    }


    @Given("^User navigate to AgePage$")
    public void userNavigateToAgePage() {
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^User enters name : \"([^\"]*)\"$")
    public void userEntersName(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(arg1);
    }

    @And("^User enters age : \"([^\"]*)\"$")
    public void userEntersAge(int arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.id("age"));
        ageText.sendKeys("" + arg1);
    }

    @And("^Click on submit button$")
    public void clickOnSubmitButton() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see the message : \"([^\"]*)\"$")
    public void userSeeTheMessage(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }

}



