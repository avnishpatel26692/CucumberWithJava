package stepDefinitions;

import Pages.AgePage;
import Pages.AgeSubmittedPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Steps4PO {
    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPO;

    public Steps4PO(){
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^I am on the page using PO$")
    public void i_am_on_the_page_using_PO() throws Throwable {
        driver.get(agePO.agePageURL);
    }

    @When("^user enter name : \"([^\"]*)\" using PO$")
    public void user_enter_name_using_PO(String arg1) throws Throwable {
        agePO.enterName("Ann");
            }

    @When("^user enter age : \"([^\"]*)\" using PO$")
    public void user_enter_age_using_PO(String arg1) throws Throwable {
        agePO.enterAge("25");
    }

    @When("^Click on submit button using PO$")
    public void click_on_submit_button_using_PO() throws Throwable {
        agePO.clickOnSubmitBtn();
    }

    @Then("^user sees message : \"([^\"]*)\" using PO$")
    public void user_sees_message_using_PO(String arg1) throws Throwable {
       ageSubmittedPO.getMessage();
    }
}
