package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class Sample5Steps {
    private WebDriver driver;

    public Sample5Steps() {
        this.driver = Hooks.driver;
    }

    @When("^User enter details$")
    public void user_enter_details(Map<String, String> arg1) throws Throwable {
        for (Map.Entry<String, String> map : arg1.entrySet()){
            WebElement element = driver.findElement(By.id(map.getKey()));
            element.clear();
            element.sendKeys(map.getValue());
        }

    }

    @Given("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) throws Throwable {
        for(Map<String, String> map : arg1.asMaps(String.class,String.class)){
            String vegetable = map.get("vegetable");

            String quantity = map.get("quantity");

            String cost = map.get("cost");

            String availability = map.get("availability");

            System.out.println("Vegetable: " + vegetable +", quantity: "+ quantity+" price: "+cost+ " in stock :"+ availability);


        }
    }
}
