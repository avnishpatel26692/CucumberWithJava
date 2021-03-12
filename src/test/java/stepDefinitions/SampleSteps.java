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

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^User enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
       WebElement name = driver.findElement(By.id("name"));
       name.clear();
       name.sendKeys(arg1);
    }

    @When("^User enter age : (\\d+)$")
    public void user_enter_age(int arg1) throws Throwable {
        WebElement age = driver.findElement(By.id("age"));

        age.sendKeys(""+arg1);

    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("Submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        WebElement response = driver.findElement(By.id("message"));
        Assert.assertEquals(arg1,response.getText());
    }
    @When("^User navigates to Link Page$")
    public void user_navigates_to_Link_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/po");
    }

    @Then("^user should verify page is opened correctly$")
    public void user_should_verify_page_is_opened_correctly() throws Throwable {
        WebElement head1text = driver.findElement(By.xpath("//h1[text()='Lorem ipsum']"));
        Assert.assertEquals("Lorem ipsum", head1text.getText());
    }

    //Task1 steps
    @Given("^I am on number page$")
    public void i_am_on_number_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");

    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void i_enter_number(String arg1) throws Throwable {
        WebElement numberField = driver.findElement(By.id("numb"));
        numberField.clear();
        numberField.sendKeys(arg1);
    }

    @When("^I click submit number$")
    public void i_click_submit_number() throws Throwable {
        WebElement btn = driver.findElement(By.xpath("//button[text()='Submit']"));
        btn.click();
    }

    @Then("^I see a message: \"([^\"]*)\"$")
    public void i_see_a_message(String arg1) throws Throwable {
        WebElement errorMsg = driver.findElement(By.id("ch1_error"));
        Assert.assertEquals(arg1,errorMsg.getText());

    }

    @Then("^I see a new message: \"([^\"]*)\"$")
    public void i_see_a_new_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1,driver.switchTo().alert().getText());
    }
    //Sample 4
    @Given("^I am on action page$")
    public void i_am_on_action_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/actions");
    }

    @When("^I clicked on checkboxes:$")
    public void i_clicked_on_checkboxes(List<String> arg1) throws Throwable {
        for(String value : arg1){
            String xpath = "//input[@type='checkbox'][@value='" + value + "']";
            driver.findElement(By.xpath(xpath)).click();
        }
    }

    @When("^I click the result checkbox button$")
    public void i_click_the_result_checkbox_button() throws Throwable {
        driver.findElement(By.id("result_button_checkbox")).click();
    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
        Assert.assertEquals(arg1,driver.findElement(By.id("result_checkbox")).getText());
    }
}



