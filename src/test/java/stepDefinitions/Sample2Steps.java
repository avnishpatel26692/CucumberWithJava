package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample2Steps {

    private WebDriver driver;

    public Sample2Steps() {
        this.driver = Hooks.driver;
    }

    @When("^User navigates to Link Page$")
    public void user_navigates_to_Link_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/po");
    }

    @Then("^User verifies that page opened successfully$")
    public void user_verifies_that_page_opened_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("Lorem ipsum", driver.findElement(By.xpath("//h1[text()='Lorem ipsum']")).getText());
    }

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^User enter name \"([^\"]*)\" and enter age \"([^\"]*)\" and press button$")
    public void user_enter_name_and_enter_age_and_press_button(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement textField = driver.findElement(By.id("name"));
        textField.clear();
        textField.sendKeys(arg1);

        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys(arg2);

        WebElement button = driver.findElement(By.id("submit"));
        button.click();
    }

    @Then("^User see message \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }
}
