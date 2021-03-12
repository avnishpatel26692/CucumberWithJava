package stepDefinitions;

import cucumber.api.DataTable;
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

public class Sample4steps {
    private WebDriver driver;

    public Sample4steps() {
        this.driver = Hooks.driver;
    }

    @Given("^i am on action page$")
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

    @When("^I click on result checkbox button$")
    public void i_click_on_result_checkbox_button()  {
        driver.findElement(By.id("result_button_checkbox")).click();

    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("result_checkbox")).getText());


    }


    @Given("^i have the following order$")
    public void iHaveTheFollowingOrder(DataTable arg1) throws Exception {
        for (Map<String, String> map: arg1.asMaps(String.class, String.class)) {
            String vegetableName = map.get("vegetable"); //cucumber
            String quantity = map.get("amount"); //4
            String cost = map.get("cost"); //cost
            System.out.println("Vegetable name : " + vegetableName);
            System.out.println("Vegetable amount : " + quantity);
            System.out.println("Vegetable cost : " + cost);
        }
    }
}
