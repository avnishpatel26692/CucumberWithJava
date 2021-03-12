package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sample2PO {

    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPO;
    public Sample2PO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^I am on age page using PO$")
    public void iAmOnAgePageUsingPO() {
        driver.get(agePO.url);
    }

    @When("^I enter name: \"([^\"]*)\" using PO$")
    public void iEnterNameUsingPO(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.setName(arg0);
    }

    @And("^I enter age: (\\d+) using PO$")
    public void iEnterAgeUsingPO(int arg0) {
        agePO.setAge(arg0);
    }

    @And("^I click submit age using PO$")
    public void iClickSubmitAgeUsingPO() {
        agePO.clickSubmit();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void iSeeMessageUsingPO(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(arg0, ageSubmittedPO.getMessage());
    }
}
