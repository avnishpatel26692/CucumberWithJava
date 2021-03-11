package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample2StepDefs {

    WebDriver driver;

    public Sample2StepDefs(){
        driver = Hooks.driver;
    }

    @When("^user navigates to Age page$")
    public void userNavigatesToAgePage() {
        driver.get("https://kristinek.github.io/site/examples/age.html");
    }

    @When("^User enter name : \"([^\"]*)\"$")
    public void userEnterName(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        WebElement name = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.clear();
        name.sendKeys(arg0);
    }

    @And("^User enter age : (\\d+)$")
    public void userEnterAge(int arg0) {
        WebElement age = driver.findElement(By.id("age"));
        age.clear();
        age.sendKeys(String.valueOf(arg0));
    }

    @And("^Click on Submit button$")
    public void clickOnSubmitButton() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("^User see message : \"([^\"]*)\"$")
    public void userSeeMessage(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg0, driver.findElement(By.id("message")).getText());
    }
}
