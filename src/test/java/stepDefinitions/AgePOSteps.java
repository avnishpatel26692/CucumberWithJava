package stepDefinitions;

import Pages.AgePO;
import Pages.AgeSubmitPO;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class AgePOSteps {
    private WebDriver driver;
    AgePO agePO;
    AgeSubmitPO ageSubmittedPO;
    public AgePOSteps() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePO.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmitPO.class);
    }

    @Given("^I am on age page using PO$")
    public void i_am_on_age_page_using_PO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(agePO.ageUrl);
    }

    @When("^I enter name: \"([^\"]*)\" using PO$")
    public void i_enter_name_using_PO(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
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
        agePO.clickSubmitBtn();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg1,ageSubmittedPO.getMessage());
    }
    @Given("^I am on age page$")
    public void i_am_on_age_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(agePO.ageUrl);
    }

    @When("^I enter values using PO:$")
    public void i_enter_values_using_PO(Map<String,String> arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

            String name = arg1.get("name");
            String age = arg1.get("age");

            agePO.enterName(name);
            agePO.enterAge(age);





    }
}
