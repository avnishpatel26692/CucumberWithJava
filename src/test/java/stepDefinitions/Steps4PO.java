package stepDefinitions;

import Pages.AgePage;
import Pages.AgeSubmittedPage;
import Pages.PeopleList;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class Steps4PO {
    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPO;
    PeopleList addPersonButton;

    public Steps4PO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);
        addPersonButton = PageFactory.initElements(this.driver, PeopleList.class);
    }


    @Given("^I am on age page using PO$")
    public void i_am_on_age_page_using_PO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
        //throw new PendingException();
    }

    @When("^I enter name: \"([^\"]*)\" using PO$")
    public void i_enter_name_using_PO(String arg1) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        agePO.enterName(arg1);
        //throw new PendingException();
    }

    @When("^I enter age: (\\d+) using PO$")
    public void i_enter_age_using_PO(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.enterAge("" + arg1);
        //throw new PendingException();
    }

    @When("^I click submit age using PO$")
    public void i_click_submit_age_using_PO() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.clickOnSubmitBtn();
        //throw new PendingException();
    }

    @Then("^I see message: \"([^\"]*)\" using PO$")
    public void i_see_message_using_PO(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ageSubmittedPO.getMessage();
        //throw new PendingException();
    }

    @Given("^I am on age page$")
    public void i_am_on_age_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/examples/age");
        // throw new PendingException();
    }

    @When("^I enter values using PO:$")
    public void i_enter_values_using_PO(Map<String, String> arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        agePO.enterName(arg1.get("name"));
        agePO.enterAge(arg1.get("age"));
    }

    @Given("^I am on Employee page$")
    public void i_am_on_Employee_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
        //throw new PendingException();
    }

    @When("^click on Add person$")
    public void click_on_Add_person() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        addPersonButton.clickAddPersonButton();

        //throw new PendingException();
    }

    @When("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill_all_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement nameText = this.driver.findElement(By.id("name"));
        nameText.sendKeys(arg1);

        WebElement surnameText = this.driver.findElement(By.id("surname"));
        surnameText.sendKeys(arg2);

        WebElement jobText = this.driver.findElement(By.id("job"));
        jobText.sendKeys(arg3);

        WebElement dataEnterText = this.driver.findElement(By.id("dob"));
        dataEnterText.sendKeys(arg4);

        WebElement selectedCheck = this.driver.findElement(By.id(arg5));
        selectedCheck.click();

        WebElement genderButton = this.driver.findElement(By.id(arg6));
        genderButton.click();

        WebElement status = this.driver.findElement(By.id(arg6));
        status.click();

    }

        //throw new PendingException();

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement addButton = this.driver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        addButton.click();
        //throw new PendingException();
    }

    @When("^click on edit button$")
    public void click_on_edit_button1() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement editButton = this.driver.findElement(By.xpath("//*[@id='person0']/span[2]"));
        editButton.click();

        //throw new PendingException();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement nameText = this.driver.findElement(By.id("name"));//
        nameText.sendKeys(arg1);

        WebElement surnameText = this.driver.findElement(By.id("surname"));
        surnameText.sendKeys(arg2);

        WebElement jobText = this.driver.findElement(By.id("job"));
        jobText.sendKeys(arg3);

        WebElement dataEnterText = this.driver.findElement(By.id("dob"));
        dataEnterText.sendKeys(arg4);

        WebElement selectedCheck = this.driver.findElement(By.id(arg5));
        selectedCheck.click();

        WebElement genderButton = this.driver.findElement(By.id(arg6));
        genderButton.click();

        WebElement status = this.driver.findElement(By.id(arg6));
        status.click();


        // throw new PendingException();
    }

    @When("^click on edit-button$")
    public void click_on_edit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement editButton = this.driver.findElement(By.xpath("//button[contains(text(),'Edit')]"));
        editButton.click();
        //throw new PendingException();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        //Write code here that turns the phrase above into concrete actions
        WebElement removeButton = driver.findElement(By.xpath("//*[@id='person0']/span[1]"));
        removeButton.click();

        //throw new PendingException();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement resetButton = driver.findElement(By.xpath("//button[contains(text(),'Reset List')]"));
        resetButton.click();
        //throw new PendingException();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        WebElement clearButton = driver.findElement(By.xpath(" //button[contains(text(),'Clear all fields')]"));
        clearButton.click();
       // throw new PendingException();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("",driver.findElement(By.id("name")).getText());
        Assert.assertEquals("",driver.findElement(By.id("surname")).getText());
        Assert.assertEquals("",driver.findElement(By.id("job")).getText());
        Assert.assertEquals("",driver.findElement(By.id("dob")).getText());

        //throw new PendingException();
    }


}

