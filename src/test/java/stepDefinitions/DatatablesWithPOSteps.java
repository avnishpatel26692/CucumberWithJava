package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.AgePage;
import pages.AgeSubmittedPage;

import java.util.Map;

public class DatatablesWithPOSteps {
    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPage;

    public DatatablesWithPOSteps() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPage = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
    }

    @Given("^I am on age page$")
    public void i_am_on_age_page() throws Throwable {
        driver.get(agePO.url);

    }

    @When("^I enter values using PO:$")
    public void userEnterDetails(Map<String, String> arg1) throws Throwable {
        for (Map.Entry<String, String> map : arg1.entrySet()) {
            String mapKey = map.getKey(); //name , age
            String mapValue = map.getValue(); //Ann , 5
            WebElement element = driver.findElement(By.id(mapKey));
            element.clear();
            element.sendKeys(mapValue);
        }
    }

    @When("^I click submit age using PO$")
    public void i_click_submit_age_using_PO() throws Throwable {
       agePO.clickOnSubmit();

    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        Assert.assertEquals(arg1, ageSubmittedPage.getMessage());

    }

}
