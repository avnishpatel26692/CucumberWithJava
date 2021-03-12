package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.AgePage;
import pages.AgeSubmittedPage;

public class StepsWithPO {
    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPage;

    public StepsWithPO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPage = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^User navigates to Age Page using PO$")
    public void user_navigates_to_Age_Page_using_PO() throws Throwable {
        driver.get(agePO.url);

    }

    @When("^User enter name : \"([^\"]*)\" using PO$")
    public void user_enter_name_using_PO(String arg1) throws Throwable {
        agePO.enterName(arg1);

    }

    @When("^User enter age : \"([^\"]*)\" using PO$")
    public void user_enter_age_using_PO(String arg1) throws Throwable {
        agePO.enterAge(arg1);

    }

    @When("^Click on Submit button using PO$")
    public void click_on_Submit_button_using_PO() throws Throwable {
       agePO.clickOnSubmit();

    }

    @Then("^User see message : \"([^\"]*)\" using PO$")
    public void user_see_message_using_PO(String arg1) throws Throwable {
        Assert.assertEquals(arg1, ageSubmittedPage.getMessage());
    }


}
