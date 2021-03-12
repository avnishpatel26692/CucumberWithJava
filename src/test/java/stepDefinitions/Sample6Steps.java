package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample6Steps {

    private WebDriver driver;

    public Sample6Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^User navigates to Age Page$")
    public void user_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age.html");


    }

    @When("^User enter name : \"([^\"]*)\"$")
    public void user_enter_name(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.name("name"));
        nameText.clear();
        nameText.sendKeys(arg1);
    }

    @When("^User enter age : (\\d+)$")
    public void user_enter_age(int arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.name("age"));
        ageText.sendKeys("" + arg1);
    }

    @When("^Click on Submit button$")
    public void click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }


}
