
package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class Sample4Steps {

        private WebDriver driver;

        public Sample4Steps() {
            this.driver = Hooks.driver;
        }

        @Given("^I am on action page$")
        public void i_am_on_action_page() throws Throwable {
            driver.get("https://kristinek.github.io/site/examples/actions");
        }

        @When("^I clicked on checkboxes:$")
        public void i_clicked_on_checkboxes(List<String> arg1) throws Throwable {
            for(String value : arg1)
            {
                String checkboxName = value;
                String xpath = "//input[@type='checkbox'][@value='" + checkboxName + "']";
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

        @When("^User enter details$")
        public void user_enter_details(Map<String, String> arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            for(Map.Entry<String, String> map : arg1.entrySet())
            {
                String mapKey = map.getKey(); //name , age
                String mapValue = map.getValue(); //Ann , 5
                WebElement element = driver.findElement(By.id(mapKey));
                element.clear();
                element.sendKeys(mapValue);
            }
        }
    }

