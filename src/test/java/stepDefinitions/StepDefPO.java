package stepDefinitions;

import Pages.AgePage;
import Pages.AgeSubmittedPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;



public class StepDefPO {

    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPagePO;

    public StepDefPO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPagePO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);

    }

    @Given("^User navigates to Age page using PO$")
    public void user_navigates_to_Age_page_using_PO() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");

    }

    @When("^user enter name using PO : \"([^\"]*)\"$")
    public void user_enter_name_using_PO(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.clear();
        nameText.sendKeys(arg1);

    }

    @When("^user enter age using PO : \"([^\"]*)\"$")
    public void user_enter_age_using_PO(String arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.id("age"));
        ageText.sendKeys("" + arg1);

    }

    @When("^click Submit button using PO$")
    public void click_Submit_button_using_PO() throws Throwable {
        driver.findElement(By.id("submit")).click();

    }

    @Then("^user see message using PO : \"([^\"]*)\"$")
    public void user_see_message_using_PO(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());

    }

}
