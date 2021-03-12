package stepDefinitions;

import Pages.AgeSubmittedPage;
import Pages.EmployeePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class Task2Steps {
    EmployeePage employeePO;
    private WebDriver driver;

    public Task2Steps() {

        this.driver = Hooks.driver;
        employeePO = PageFactory.initElements(this.driver, EmployeePage.class);
    }

    @Given("^I am on Employee page$")
    public void i_am_on_Employee_page() throws Throwable {
        driver.get(employeePO.employeePageURL);
    }

    @When("^click on Add person$")
    public void click_on_Add_person() throws Throwable {
        employeePO.clickOnAddPersonBtn();
    }

    @When("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill_all_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable
    {
        employeePO.enterName(arg1);
        employeePO.enterSurname(arg2);
        employeePO.enterJob(arg3);
        employeePO.enterDataEnter(""+arg4);
        if (arg5=="english"){employeePO.selectEnglishOption();}
            else if (arg5=="french"){employeePO.selectFrenchOption();}
            else {employeePO.selectSpanishOption();}
        if (arg6=="male"){employeePO.selectMaleGender();}
            else {employeePO.selectFemaleGender();}
        if (arg7=="Employee"){employeePO.selectStatusEmployee();}
            else if (arg7=="Intern"){employeePO.selectStatusIntern();}
            else {employeePO.selectStatusContractor();}
    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        employeePO.clickAddBtn();
    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        employeePO.clickEditBtn();

    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        {
            employeePO.enterName(arg1);
            employeePO.enterSurname(arg2);
            employeePO.enterJob(arg3);
            employeePO.enterDataEnter(""+arg4);
            if (arg5=="english"){employeePO.selectEnglishOption();}
            else if (arg5=="french"){employeePO.selectFrenchOption();}
            else {employeePO.selectSpanishOption();}
            if (arg6=="male"){employeePO.selectMaleGender();}
            else {employeePO.selectFemaleGender();}
            if (arg7=="Employee"){employeePO.selectStatusEmployee();}
            else if (arg7=="Intern"){employeePO.selectStatusIntern();}
            else {employeePO.selectStatusContractor();}
        }


    }

    @When("^click on other edit button$")
    public void click_on_other_edit_button() throws Throwable {
        employeePO.clickEditOtherBtn();

    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        employeePO.clickOnRemoveAPerson();

    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
       employeePO.clickOnResetListBtn();

    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        employeePO.clickOnClearAllFieldsBtn();

    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        Assert.assertTrue(employeePO.getName().isEmpty());
        Assert.assertTrue(employeePO.getSurname().isEmpty());
        Assert.assertTrue(employeePO.getJob().isEmpty());
        Assert.assertTrue(employeePO.getDataEnter().isEmpty());
        Assert.assertFalse(employeePO.verifyCheckBoxIsSelected(0));
        Assert.assertFalse(employeePO.verifyCheckBoxIsSelected(1));
        Assert.assertFalse(employeePO.verifyCheckBoxIsSelected(2));
        Assert.assertFalse(employeePO.verifyRadioButtonIsSelected(0));
        Assert.assertFalse(employeePO.verifyRadioButtonIsSelected(1));
        Assert.assertEquals("Employee",employeePO.getSelectedOption());
    }

}
