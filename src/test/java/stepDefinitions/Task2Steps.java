package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2Steps {


    private WebDriver driver;

    public Task2Steps() {
        this.driver = Hooks.driver;
    }



    @Given("^I am on Employee page$")
    public void i_am_on_Employee_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
    }

    @When("^click on Add person$")
    public void click_on_Add_person() throws Throwable {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @When("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill_all_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(arg1);
        driver.findElement(By.id("surname")).sendKeys(arg2);
        driver.findElement(By.id("job")).sendKeys(arg3);
        driver.findElement(By.id("dob")).sendKeys(arg4);
        driver.findElement(By.id(arg5)).click();
        driver.findElement(By.id(arg6)).click();

        Select select  = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select.selectByVisibleText(arg7);
    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        driver.findElement(By.id("modal_button")).click();

    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(arg1);
        driver.findElement(By.id("surname")).sendKeys(arg2);
        driver.findElement(By.id("job")).sendKeys(arg3);
        driver.findElement(By.id("dob")).sendKeys(arg4);
        driver.findElement(By.id(arg5)).click();
        driver.findElement(By.id(arg6)).click();

        Select select  = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select.selectByVisibleText(arg7);


    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        driver.findElement(By.xpath("//span['deletePerson(0)']"));

    }
    @And("^click on edit-button$")
    public void clickOnEditButton2() {
        driver.findElement(By.id("modal_button")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        driver.findElement(By.xpath("//button[@id='addPersonBtn'][text() = 'Reset List']")).click();

    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.id("addPersonBtn")).click();

    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        Assert.assertEquals("", driver.findElement(By.id("name")).getText());
        Assert.assertEquals("", driver.findElement(By.id("surname")).getText());
        Assert.assertEquals("", driver.findElement(By.id("job")).getText());
        Assert.assertEquals("", driver.findElement(By.id("dob")).getText());
        Assert.assertTrue(driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("spanish")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("male")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("female")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("status")).isSelected());
    }





}
