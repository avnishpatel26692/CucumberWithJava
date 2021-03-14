package stepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
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
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class Task2 {
    private WebDriver driver;

    public Task2() {
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
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys(arg1);

        WebElement surnameField = driver.findElement(By.id("surname"));
        surnameField.sendKeys(arg2);

        WebElement jobField = driver.findElement(By.id("job"));
        jobField.sendKeys(arg3);

        WebElement dateField = driver.findElement(By.id("dob"));
        dateField.sendKeys(arg4);

        driver.findElement(By.id(arg5)).click();

        driver.findElement(By.id(arg6)).click();

       Select select = new Select(driver.findElement(By.xpath("//select[@id='status']")));
       select.selectByVisibleText(arg7);
    }


    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        driver.findElement(By.xpath("//button[@onclick='addPersonToList()']")).click();
    }

    @When("^click on edit button$")
    public void clicks_on_edit_button() throws Throwable {
    driver.findElement(By.xpath("//span[@onclick ='openModalForEditPerson(3)']")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.clear();
        nameField.sendKeys(arg1);

        WebElement surnameField = driver.findElement(By.id("surname"));
        surnameField.clear();
        surnameField.sendKeys(arg2);

        WebElement jobField = driver.findElement(By.id("job"));
        jobField.clear();
        jobField.sendKeys(arg3);

        WebElement dateField = driver.findElement(By.id("dob"));
        dateField.sendKeys(arg4);

        driver.findElement(By.id(arg5)).click();

        driver.findElement(By.id(arg6)).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='status']")));
        select.selectByVisibleText(arg7);

    }

    @When("^click on edit-button$")
    public void click_on_edit_button() throws Throwable {
        driver.findElement(By.xpath("//button[@onclick = 'editPerson(3)']")).click();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        driver.findElement(By.xpath("//span[@onclick ='deletePerson(3)']")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        driver.findElement(By.xpath("//button[@onclick ='resetListOfPeople()']")).click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.xpath("//button[@id='addPersonBtn']")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        Assert.assertEquals("",driver.findElement(By.id("name")).getText() );
        Assert.assertEquals("",driver.findElement(By.id("surname")).getText() );
        Assert.assertEquals("",driver.findElement(By.id("job")).getText() );
        Assert.assertEquals("",driver.findElement(By.id("dob")).getText() );
        Assert.assertTrue("english",driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse("",driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse("",driver.findElement(By.id("spanish")).isSelected());
        Assert.assertFalse("",driver.findElement(By.id("male")).isSelected());
        Assert.assertFalse("",driver.findElement(By.id("female")).isSelected());
    }





}