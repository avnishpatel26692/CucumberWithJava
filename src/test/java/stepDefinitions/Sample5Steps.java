
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

public class Sample5Steps {

    private WebDriver driver;

    public Sample5Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
    }


    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        String msg = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(arg1, msg);
    }



}



