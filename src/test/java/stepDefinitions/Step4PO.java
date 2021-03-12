package stepDefinitions;

import Pages.AgePage;
import Pages.AgeSubmittedPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;


public class Step4PO {

    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPO;

    public Step4PO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^I am on age page using PO$")
    public void i_am_on_page_using_PO() throws Throwable {
        //Write code here that turns the phrase above into concrete action
        driver.get(agePO.agePageURL);
    }

    @When("^I enter name: \"([^\"]*)\" using PO$")
    public void i_enter_name_using_PO(String arg1) throws Throwable {
        //Write code here that turns the phrase above into concrete action
        agePO.enterName(arg1);
    }

    @When("^I enter age: (\\d+) using PO$")
    public void i_enter_age_using_PO(int arg1) throws Throwable {
        //Write code here that turns the phrase above into concrete action
        agePO.enterAge(""+arg1);
    }

    @When("^I click submit age using PO$")
    public void i_click_submit_age_using_PO() throws Throwable {
        //Write code here that turns the phrase above into concrete action
        agePO.clickOnSubmitBtn();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        //Write code here that turns the phrase above into concrete action
        Assert.assertEquals(arg1,ageSubmittedPO.getMessage());
    }
// Sample5UsingPO

      @When("^I enter values using PO:$")
    public void i_enter_values_using_PO(Map<String, String> arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.enterName(arg1.get("name"));
        agePO.enterAge(arg1.get("age"));
    }

}

