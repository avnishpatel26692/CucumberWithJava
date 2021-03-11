package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class Sample3 {

    private WebDriver driver;

    public Sample3(){
        driver = Hooks.driver;
    }

    @Given("^I am on number page$")
    public void iAmOnNumberPage() {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }

    @When("^I enter number: \"([^\"]*)\"$")
    public void iEnterNumber(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        WebElement numb = driver.findElement(By.id("numb"));
        numb.sendKeys(arg0);

    }

    @And("^I click submit number$")
    public void iClickSubmitNumber() {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/button")).click();
    }

    @Then("^I see a message: \"([^\"]*)\"$")
    public void iSeeAMessage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        WebElement ch1_error = driver.findElement(By.id("ch1_error"));
        assertEquals(arg0, ch1_error.getText());
    }

    @Then("^I see a new message: \"([^\"]*)\"$")
    public void iSeeANewMessage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        Alert alert = driver.switchTo().alert();
        assertEquals(arg0, alert.getText());
    }
}
