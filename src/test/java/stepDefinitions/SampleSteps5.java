package stepDefinitions;

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

public class SampleSteps5 {
    private WebDriver driver;

    public SampleSteps5() {
        this.driver = Hooks.driver;
    }
    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
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
