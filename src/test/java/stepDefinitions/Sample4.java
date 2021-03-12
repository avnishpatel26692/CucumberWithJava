package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Sample4 {

    private WebDriver driver;

    public Sample4(){
        driver = Hooks.driver;
    }

    @Given("^I am on action page$")
    public void iAmOnActionPage() {
        driver.get("https://kristinek.github.io/site/examples/actions");
    }

    @When("^I clicked on checkboxes:$")
    public void iClickedOnCheckboxes(List<String> arg1) {
        for (String value : arg1){
            String Start_xpath = "//input[@type='checkbox'][@value='";
            String checkboxName = value;
            String end_xpath = "']";
            String xpath = Start_xpath + checkboxName + end_xpath;
            System.out.println("Xpath : " + xpath);
            driver.findElement(By.xpath(xpath)).click();
        }

    }


    @And("^I click the result checkbox button$")
    public void iClickTheResultCheckboxButton() {
        driver.findElement(By.id("result_button_checkbox")).click();
    }

    @Then("^message for checkboxes \"([^\"]*)\" is seen$")
    public void messageForCheckboxesIsSeen(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg0, driver.findElement(By.id("result_button_checkbox")).getText());
        throw new PendingException();
    }
}
