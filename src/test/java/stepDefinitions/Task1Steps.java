package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1Steps {
    private WebDriver driver;

    public Task1Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on number page$")
    public void i_am_on_number_page() throws Throwable {
       driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
       Assert.assertEquals("https://kristinek.github.io/site/tasks/enter_a_number", driver.getCurrentUrl());
    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void i_enter_number(String arg1) throws Throwable {
        WebElement numField = driver.findElement(By.id("numb"));
        numField.sendKeys(arg1);
    }

    @When("^I click submit number$")
    public void i_click_submit_number() throws Throwable {
        driver.findElement(By.tagName("button")).click();
    }

    @Then("^I see a message: \"([^\"]*)\"$")
    public void i_see_a_message(String arg1) throws Throwable {
        WebElement errorMessage = driver.findElement(By.id("ch1_error"));
        Assert.assertEquals(arg1, errorMessage.getText());
    }

    @Then("^I see a new message: \"([^\"]*)\"$")
    public void i_see_a_new_message(String arg1) throws Throwable {
        Alert alert = driver.switchTo().alert();
        Assert.assertTrue(alert.getText().contains(arg1));
    }
}