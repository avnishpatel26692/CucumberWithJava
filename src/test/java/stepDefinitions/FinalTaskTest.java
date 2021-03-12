package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FinalTaskTest {
    private WebDriver driver;

    public FinalTaskTest() {
        this.driver = Init.driver;
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
    public void fill_all_fields(String name, String surname, String job, String dob, String language, String gender, String status) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("surname")).sendKeys(surname);
        driver.findElement(By.id("job")).sendKeys(job);
        driver.findElement(By.id("dob")).sendKeys(dob);
        WebElement english = driver.findElement(By.id("english"));
        WebElement spanish = driver.findElement(By.id("spanish"));
        WebElement french = driver.findElement(By.id("french"));        if(english.isSelected()) {
            english.click();
        } else if (spanish.isSelected()) {
            spanish.click();
        } else if (french.isSelected()) {
            french.click();
        }
        driver.findElement(By.id(language)).click();
        driver.findElement(By.id(gender)).click();
        Select dropdown = new Select(driver.findElement(By.id("status")));
        dropdown.selectByValue(status);
    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        driver.findElement(By.xpath("//button[text()='Add']")).click();
    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='person3']/span[2]/i")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String name, String surname, String job, String dob, String language, String gender, String status) throws Throwable {
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys(name);
        driver.findElement(By.id("surname")).clear();
        driver.findElement(By.id("surname")).sendKeys(surname);
        driver.findElement(By.id("job")).clear();
        driver.findElement(By.id("job")).sendKeys(job);
        driver.findElement(By.id("dob")).clear();
        driver.findElement(By.id("dob")).sendKeys(dob);
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
        driver.findElement(By.id(language)).click();
        driver.findElement(By.id(gender)).click();
        Select dropdown = new Select(driver.findElement(By.id("status")));
        dropdown.selectByValue(status);
    }

    @When("^click on edit-button$")
    public void click_on_editButton() throws Throwable {
        driver.findElement(By.xpath("//button[text()='Edit']")).click();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        driver.findElement(By.xpath("//*[@id='person3']/span[1]")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        driver.findElement(By.xpath("//button[text()='Reset List']")).click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.xpath("//button[text()='Clear all fields']")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        Assert.assertEquals("",driver.findElement(By.id("name")).getText());
        Assert.assertEquals("",driver.findElement(By.id("surname")).getText());
        Assert.assertEquals("",driver.findElement(By.id("job")).getText());
        Assert.assertEquals("",driver.findElement(By.id("dob")).getText());
        WebElement english = driver.findElement(By.id("english"));
        WebElement spanish = driver.findElement(By.id("spanish"));
        WebElement french = driver.findElement(By.id("french"));
        Assert.assertTrue(english.isSelected());
        Assert.assertFalse(spanish.isSelected());
        Assert.assertFalse(french.isSelected());
        Assert.assertFalse(driver.findElement(By.id("male")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("female")).isSelected());
        Select dropdown = new Select(driver.findElement(By.id("status")));
        Assert.assertEquals("Employee",dropdown.getFirstSelectedOption().getText());
    }

}
