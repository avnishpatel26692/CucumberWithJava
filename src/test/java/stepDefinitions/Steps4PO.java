package stepDefinitions;


import Pages.AgePage;
import Pages.AgeSubmittedPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Steps4PO {

    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPO;

    public Steps4PO() {

        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^I am on age page using PO$")
    public void i_am_on_age_page_using_PO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
    }

    @When("^I enter name: \"([^\"]*)\" using PO$")
    public void i_enter_name_using_PO(String arg1) throws Throwable {
       agePO.enterName(arg1);
    }

    @When("^I enter age: (\\d+) using PO$")
    public void i_enter_age_using_PO(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.enterAge(""+arg1);
    }

    @When("^I click submit age using PO$")
    public void i_click_submit_age_using_PO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.clickOnSubmitBtn();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       ageSubmittedPO.getMessage();
    }



}