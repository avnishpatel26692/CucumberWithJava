package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xpath.operations.String;
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

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");

    }

    @When("^User enter details$")
    public void user_enter_details(Map<String, String> arg1) throws Throwable {
        for (Map.Entry<String, String> map : arg1.entrySet()) {
            String mapKey = map.getKey(); //name, age
            String mapValue = map.getValue(); //Ann, 5
            WebElement element = driver.findElement(By.id(mapKey));
            element.clear();
            element.sendKeys(mapValue);

        }
    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }

    @Given("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) throws Throwable {
        for (Map<String, String> map : arg1.asMaps(String.class, String.class)) {
            String vegName = map.get("vegetable"); //example: cucumber
            String vegQuantity = map.get("quantity"); //example: 4
            String vegPrice = map.get("cost"); //example: 10
            String availability = map.get("Availability"); //example: yes, 5
            System.out.println("Vegetable Name: " + vegName);
            System.out.println("Vegetable Quantity: " + vegQuantity);
            System.out.println("Vegetable Cost: " + vegPrice);
            System.out.println("Vegetable Availability: " + availability);


        }

    }
}