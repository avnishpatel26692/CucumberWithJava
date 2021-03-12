package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.DataTableRow;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Sample3Steps {

    private WebDriver driver;

    public Sample3Steps() {
        this.driver = Init.driver;
    }

    @Given("^I am on action page$")
    public void i_am_on_action_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/actions");
    }

    @When("^I clicked on checkboxes:$")
    public void i_clicked_on_checkboxes(DataTable arg1) throws Throwable {
        List<String> list = arg1.asList(String.class);
        for(String row: list) {
            String xpath = "//input[@value='" + row + "']";
            driver.findElement(By.xpath(xpath)).click();
        }
    }

    @When("^I click the result checkbox button$")
    public void i_click_the_result_checkbox_button() throws Throwable {
        driver.findElement(By.id("result_button_checkbox")).click();
    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("result_checkbox")).getText());
    }
}
