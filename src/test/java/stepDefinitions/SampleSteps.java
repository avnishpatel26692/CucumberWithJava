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

    @Given("^User navigate to Age page$")
    public void user_navigate_to_Age_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age.html");
        WebElement enterName = driver.findElement(By.id("name"));
        enterName.clear();

    }


    @When("^User enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
        WebElement enterName = driver.findElement(By.id("name"));
        enterName.sendKeys("Ann");
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^User enter age : (\\d+)$")
    public void user_enter_age(int arg1) throws Throwable {
        WebElement enterAge = driver.findElement(By.id("age"));
        enterAge.sendKeys("" + arg1);

        // Write code here that turns the phrase above into concrete actions

    }

    @And("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Hello, Ann, you are a kid", driver.findElement(By.id("message")).getText());
    }

    @When("^I clicked on checkboxes:$")
    public void i_clicked_on_checkboxes(List<String> arg1) throws Throwable {
        for (String value : arg1) {
            String Start_xpath = "//input[@type='checkbox'][@value='";
            String checkboxName = value;
            String end_xpath = "']";
            String xpath = Start_xpath + checkboxName + end_xpath;
            System.out.println("Xpath : " + xpath);
            driver.findElement(By.xpath(xpath)).click();
        }

    }
}





