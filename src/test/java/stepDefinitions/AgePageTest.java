package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.AgePage;

import java.util.List;
import java.util.Map;

public class AgePageTest {
    private WebDriver driver;
    private AgePage agePage;

    public AgePageTest() {
        this.driver = Init.driver;
        agePage = PageFactory.initElements(this.driver, AgePage.class);
    }

    @Given("^I am on age page$")
    public void i_am_on_age_page() throws Throwable {
        driver.get(agePage.getAgePageURL());
    }

    @When("^I enter values using PO:$")
    public void i_enter_values_using_PO(Map<String, String> arg1) throws Throwable {
        agePage.enterNameInput(arg1.get("name"));
        agePage.enterAgeInput(arg1.get("age"));
    }

    @When("^I click submit age using PO$")
    public void i_click_submit_age_using_PO() throws Throwable {
            agePage.clickSubmitBtn();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        agePage.verifyMessage(arg1);
    }

}
