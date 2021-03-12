package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class Sample5 {

    private WebDriver driver;

    public Sample5(){
        driver = Hooks.driver;
    }

    @Given("^User navigates to Age Page$")
    public void userNavigatesToAgePage() {
        driver.get("https://kristinek.github.io/site/examples/age.html");
    }

    @When("^User enter details$")
    public void user_enter_details(Map<String, String> arg1) {
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

    @Given("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) {
        // Write code here that turns the phrase above into concrete actions
        for(Map<String, String> map: arg1.asMaps(String.class, String.class))
        {
            String vegetableName = map.get("vegetable"); //cucumber
            String quantity = map.get("quantity"); //4
            String price = map.get("cost"); //10
            String avail = map.get("Availability");
            System.out.println("Vegetable Name : " +vegetableName);
            System.out.println("Quantity : " +quantity);
            System.out.println("Cost : " +price);
            System.out.println("Availability: " + avail);
        }
    }
}
