package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Steps4Task2 {
    private WebDriver driver;

    public Steps4Task2 () {
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
    public void fill_all_fields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        driver.findElement(By.id("name")).sendKeys(arg0);
        driver.findElement(By.id("surname")).sendKeys(arg1);
        driver.findElement(By.id("job")).sendKeys(arg2);
        driver.findElement(By.id("dob")).sendKeys(arg3+ Keys.TAB);
        driver.findElement(By.id(arg4)).click();
        driver.findElement(By.id(arg5)).click();

        Select select = new Select(driver.findElement(By.id("status")));
        select.selectByVisibleText(arg6);
        }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        driver.findElement(By.id("modal_button")).click();
    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        driver.findElement(By.id("name")).sendKeys(arg0);
        driver.findElement(By.id("surname")).sendKeys(arg1);
        driver.findElement(By.id("job")).sendKeys(arg2);
        driver.findElement(By.id("dob")).sendKeys(arg3);
        driver.findElement(By.id(arg4)).click();
        driver.findElement(By.id(arg5)).click();

        Select select = new Select(driver.findElement(By.id("status")));
        select.selectByVisibleText(arg6);
    }


    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"person1\"]/span[1]"));
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        assertTrue(driver.findElement(By.id("name")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("surname")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("job")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("dob")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("english")).isSelected());
        assertFalse(driver.findElement(By.id("french")).isSelected());
        assertFalse(driver.findElement(By.id("spanish")).isSelected());
        assertFalse(driver.findElement(By.id("male")).isSelected());
        assertFalse(driver.findElement(By.id("female")).isSelected());
    }
    @And("^click on edit-button$")
    public void click_on_edit_button2() {
        driver.findElement(By.id("modal_button")).click();
    }
}
