package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

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
    public void fill_all_fields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(arg0);
        driver.findElement(By.id("surname")).sendKeys(arg1);
        driver.findElement(By.id("job")).sendKeys(arg2);
        driver.findElement(By.id("dob")).sendKeys(arg3);
        driver.findElement(By.id(arg4)).click(); //languages
        driver.findElement(By.id(arg5)).click(); //gender

        Select select = new Select(driver.findElement(By.id("status")));
        select.deselectByVisibleText(arg6);
        }



    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("modal_button")).click();
    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("#person3 > span:nth-child(2) > i")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String name, String surname, String job, String arg4, String arg5, String status, String date) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(surname);
        driver.findElement(By.id("job")).sendKeys(job);

        WebElement english = driver.findElement(By.id("english"));
        WebElement spanish = driver.findElement(By.id("spanish"));
        WebElement french = driver.findElement(By.id("french"));
        if(english.isSelected()) {
            english.click();
        } else if (spanish.isSelected()) {
            spanish.click();
        } else if (french.isSelected()) {
            french.click();
        }
        driver.findElement(By.id(arg4)).click();
        driver.findElement(By.id(arg5)).click();

        Select select = new Select(driver.findElement(By.id("status")));
        select.selectByValue(status);
        driver.findElement(By.id("dob")).sendKeys(Keys.ENTER);
    }

    @When("^click on edit-button$")
    public void click_on_edit_button2() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("button.w3-btn:nth-child(1)")).click();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("#person1 > span:nth-child(1)")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.cssSelector("button.w3-btn:nth-child(3)")).click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.id("#addPersonBtn")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.id("name")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.id("surname")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.id("job")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.id("dob")).getText().isEmpty());
        Assert.assertFalse(driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("spanish")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("male")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("female")).isSelected());
    }
}
