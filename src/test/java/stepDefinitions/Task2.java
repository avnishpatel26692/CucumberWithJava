package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Task2 {

    private WebDriver driver;

    public Task2() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Employee page$")
    public void iAmOnEmployeePage() {
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
    }

    @When("^click on Add person$")
    public void clickOnAddPerson() {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @And("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fillAllFields(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("name")).sendKeys(arg0);
        driver.findElement(By.id("surname")).sendKeys(arg1);
        driver.findElement(By.id("job")).sendKeys(arg2);
        driver.findElement(By.id("dob")).sendKeys(arg3);
        driver.findElement(By.id(arg4)).click();
        driver.findElement(By.id(arg5)).click();

        Select select = new Select(driver.findElement(By.id("status")));
        select.selectByVisibleText(arg6);
    }

    @Then("^click button add$")
    public void clickButtonAdd() {
        driver.findElement(By.id("modal_button")).click();
    }

    @When("^click on edit button$")
    public void clickOnEditButton() {
        driver.findElement(By.xpath("//*[@id=\"person0\"]/span[2]/i")).click();
    }

    @And("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void editSomething(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("name")).sendKeys(arg0);
        driver.findElement(By.id("surname")).sendKeys(arg1);
        driver.findElement(By.id("job")).sendKeys(arg2);
        driver.findElement(By.id("dob")).sendKeys(arg3);
        driver.findElement(By.id(arg4)).click();
        driver.findElement(By.id(arg5)).click();

        Select select = new Select(driver.findElement(By.id("status")));
        select.selectByVisibleText(arg6);
    }

    @And("^remove a person$")
    public void removeAPerson() {
        driver.findElement(By.xpath("//*[@id=\"person1\"]/span[1]"));
    }

    @Then("^reset list$")
    public void resetList() {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @And("^click clear-button$")
    public void clickClearButton() {
        driver.findElement(By.id("addPersonBtn")).click();
    }

    @Then("^check empty fields$")
    public void checkEmptyFields() {
        // check if fields are empty
        assertTrue(driver.findElement(By.id("name")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("surname")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("job")).getText().isEmpty());
        assertTrue(driver.findElement(By.id("dob")).getText().isEmpty());
        assertFalse(driver.findElement(By.id("english")).isSelected());
        assertFalse(driver.findElement(By.id("french")).isSelected());
        assertFalse(driver.findElement(By.id("spanish")).isSelected());
        assertFalse(driver.findElement(By.id("male")).isSelected());
        assertFalse(driver.findElement(By.id("female")).isSelected());
    }

    @And("^click on edit-button$")
    public void clickOnEditButton2() {
        driver.findElement(By.id("modal_button")).click();
    }
}
