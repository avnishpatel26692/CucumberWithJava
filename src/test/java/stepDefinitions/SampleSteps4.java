package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SampleSteps4 {
    private WebDriver driver;

    public SampleSteps4() {
        this.driver = Hooks.driver;
    }


    @Given("^I am on action page$")
    public void i_am_on_action_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/actions");

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

    @When("^I click the result checkbox button$")
    public void i_click_the_result_checkbox_button() throws Throwable {
        driver.findElement(By.id("result_button_checkbox")).click();

    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
        WebElement resultText = driver.findElement(By.id("result_checkbox"));
        Assert.assertEquals(arg1, resultText.getText());

    }
}
