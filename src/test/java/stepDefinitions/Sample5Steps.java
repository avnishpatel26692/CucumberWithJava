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

public class Sample5Steps {
    private WebDriver driver;

    public Sample5Steps() {
        this.driver = Hooks.driver;
    }

    @When("^User enter details$")
    public void user_enter_details(Map<String, String> arg1) throws Throwable {
        for(Map.Entry<String, String> map : arg1.entrySet())
        {
            String mapKey = map.getKey();
            String mapValue = map.getValue();
            WebElement element = driver.findElement(By.id(mapKey));
            element.clear();
            element.sendKeys(mapValue);
        }
    }

    @Given("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) throws Throwable {
        for(Map<String, String> map: arg1.asMaps(String.class, String.class))
        {
            String vegetableName = map.get("vegetable");
            String quantity = map.get("quantity");
            String price = map.get("cost");
            String sum = map.get("sum");
            System.out.println("Vegetable Name : " +vegetableName);
            System.out.println("Quantity : " +quantity);
            System.out.println("Cost : " +price);
            System.out.println("Sum : " +sum);
        }
    }

    @Given("^I have the following order in webshop$")
    public void i_have_the_following_order_in_webshop(DataTable arg1) throws Throwable {
        for(Map<String, String> map: arg1.asMaps(String.class, String.class))
        {
            String clothesName = map.get("clothes");
            String sizeName = map.get("size");
            String colorName = map.get("color");
            String quantityName = map.get("quantity");
            String costName = map.get("cost");
            String sumName = map.get("sum");
            System.out.println("Clothes are : " +clothesName);
            System.out.println("Size is  : " +sizeName);
            System.out.println("This color is : " +colorName);
            System.out.println("Quantity is : " +quantityName);
            System.out.println("Cost : " +costName);
            System.out.println("Sum : " +sumName);
        }
    }

}