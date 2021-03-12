package stepDefinitions;

import cucumber.api.DataTable;
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
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("result_button_checkbox")).click();
    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
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


    @Then("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for(Map<String, String> map: arg1.asMaps(String.class, String.class))
        {
            String vegetableName = map.get("vegetable"); //cucumber
            String quantity = map.get("quantity"); //4
            String price = map.get("cost"); //10
            System.out.println("Vegetable Name : " +vegetableName);
            System.out.println("Quantity : " +quantity);
            System.out.println("Cost : " +price);
        }
    }
}
