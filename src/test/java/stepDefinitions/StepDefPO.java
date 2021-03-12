package stepDefinitions;

import Pages.AgePage;
import Pages.AgeSubmittedPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class StepDefPO {

    private WebDriver driver;
    AgePage agePO;
    AgeSubmittedPage ageSubmittedPagePO;
    private String Start_xpath;

    public StepDefPO() {
        this.driver = Hooks.driver;
        agePO = PageFactory.initElements(this.driver, AgePage.class);
        ageSubmittedPagePO = PageFactory.initElements(this.driver, AgeSubmittedPage.class);

    }

    @Given("^User navigates to Age page using PO$")
    public void user_navigates_to_Age_page_using_PO() throws Throwable {
        driver.get(agePO.agePageUrl);
    }

    @When("^user enter name using PO : \"([^\"]*)\"$")
    public void user_enter_name_using_PO(String arg1) throws Throwable {
        agePO.enterName(arg1);

    }

    @When("^user enter age using PO : \"([^\"]*)\"$")
    public void user_enter_age_using_PO(int arg1) throws Throwable {
        agePO.enterAge("" + arg1);

    }

    @When("^click Submit button using PO$")
    public void click_Submit_button_using_PO() throws Throwable {
        agePO.clickOnSubmitBtn();

    }

    @Then("^user see message using PO : \"([^\"]*)\"$")
    public void user_see_message_using_PO(String arg1) throws Throwable {
        Assert.assertEquals(arg1, ageSubmittedPagePO.getMessage());

    }


    @When("^I enter values using PO:$")
    public void iEnterValuesUsingPO(Map<String, String> arg1) {
        System.out.println(arg1.get("name"));
        agePO.enterName("name");
        System.out.println(arg1.get("age"));
        agePO.enterName("age");

    }

    @Given("^I am on Employee page$")
    public void iAmOnEmployeePage() {
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
    }

    @When("^click on Add person$")
    public void clickOnAddPerson() {
        driver.findElement(By.xpath("//button[text()='Add person']")).click();
    }

    @And("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fillAllFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='job']")).sendKeys();
        driver.findElement(By.xpath("//input[@class='w3-input hasDatepicker']")).sendKeys();
        driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        driver.findElement(By.xpath("//input[@type='radio']")).isSelected();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select.selectByVisibleText(arg6);
    }

    @Then("^click button add$")
    public void clickButtonAdd() {
        driver.findElement(By.xpath("//button[text()='Add']")).click();

    }

    @When("^click on edit button$")
    public void clickOnEditButtons() {
        driver.findElement(By.xpath("//span[@class='w3-closebtn editbtn w3-padding w3-margin-right w3-medium']")).click();

    }

    @And("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void editSomething(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys();
        driver.findElement(By.xpath("//input[@id='job']")).sendKeys();
        driver.findElement(By.xpath("//input[@class='w3-input hasDatepicker']")).sendKeys();
        driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
        driver.findElement(By.xpath("//input[@type='radio']")).isSelected();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select.selectByVisibleText(arg6);
    }



    @And("^remove a person$")
    public void removeAPerson() {
        driver.findElement(By.xpath("//span[@class='w3-closebtn closebtn w3-padding w3-margin-right w3-medium']")).click();
    }

    @Then("^reset list$")
    public void resetList() {
        driver.findElement(By.xpath("//button[@onclick='resetListOfPeople()']")).click();
    }

    @And("^click clear-button$")
    public void clickClearButton() {
        driver.findElement(By.xpath("//button[text()='Clear all fields']")).click();
    }

    @Then("^check empty fields$")
    public void checkEmptyFields() {
        assertTrue(driver.findElement(By.xpath("//input[@id='name']")).getText().isEmpty());
        assertTrue(driver.findElement(By.xpath("//input[@id='surname']")).getText().isEmpty());
        assertTrue(driver.findElement(By.xpath("//input[@id='job']")).getText().isEmpty());
        assertTrue(driver.findElement(By.xpath("//input[@class='w3-input hasDatepicker']")).getText().isEmpty());
        assertTrue(driver.findElement(By.xpath("//input[@id='english']")).isSelected());
        assertFalse(driver.findElement(By.xpath("//input[@id='french']")).isSelected());
        assertFalse(driver.findElement(By.xpath("//input[@id='spanish']")).isSelected());
        assertFalse(driver.findElement(By.xpath("//label[text()='Male']")).isSelected());
        assertFalse(driver.findElement(By.xpath("//label[text()='female']")).isSelected());
    }

    @And("^click on edit-button$")
    public void clickOnEditButton() {
        driver.findElement(By.id("modal_button")).click();

    }
}

