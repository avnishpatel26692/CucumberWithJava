package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SampleStepsTask2 {
    private WebDriver driver;

    public SampleStepsTask2() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Employee page$")
    public void i_am_on_Employee_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
    }

    @When("^click on Add person$")
    public void click_on_Add_person() throws Throwable {
        WebElement addBtn = driver.findElement(By.xpath("//button[text()='Add person']"));
        addBtn.click();
    }

    @When("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill_all_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        WebElement nameTxt = driver.findElement(By.id("name"));
        nameTxt.clear();
        nameTxt.sendKeys(arg1);
        WebElement surnameTxt = driver.findElement(By.id("surname"));
        surnameTxt.clear();
        surnameTxt.sendKeys(arg2);
        WebElement jobTxt = driver.findElement(By.id("job"));
        jobTxt.clear();
        jobTxt.sendKeys(arg3);
        WebElement dateEnter = driver.findElement(By.id("dob"));
        dateEnter.clear();
        dateEnter.sendKeys(arg4);

        WebElement checkBoxesLang = driver.findElement(By.id(arg5));
        checkBoxesLang.isSelected();

        WebElement gender = driver.findElement(By.id(arg6));
        gender.click();

        WebElement statusDropDown = driver.findElement(By.id("status"));
        Select obj = new Select(statusDropDown);
        obj.selectByVisibleText(arg7);

    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        WebElement addBtn = driver.findElement(By.xpath("//button[text()='Add']"));
        addBtn.click();
         }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
//this command opens the wrong edit btn - the 1st, not the last one
        WebElement editBtn = driver.findElement(By.cssSelector("i.fa.fa-pencil"));
        editBtn.click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        WebElement nameTxt = driver.findElement(By.id("name"));
        nameTxt.clear();
        nameTxt.sendKeys(arg1);
        WebElement surnameTxt = driver.findElement(By.id("surname"));
        surnameTxt.clear();
        surnameTxt.sendKeys(arg2);
        WebElement jobTxt = driver.findElement(By.id("job"));
        jobTxt.clear();
        jobTxt.sendKeys(arg3);
        WebElement dateEnter = driver.findElement(By.id("dob"));
        dateEnter.clear();
        dateEnter.sendKeys(arg4);

        WebElement checkBoxesLang = driver.findElement(By.id(arg5));
        checkBoxesLang.isSelected();

        WebElement genderBtn = driver.findElement(By.id(arg6));
        genderBtn.click();

        WebElement statusDropDown = driver.findElement(By.id("status"));
        Select obj = new Select(statusDropDown);
        obj.selectByVisibleText(arg7);
    }
    @When("^click on edit-button$")
    public void click_on_edit__button() throws Throwable {
        WebElement editBtn = driver.findElement(By.xpath("//button[.='Edit']"));
        editBtn.click();
    }
        @When("^remove a person$")
    public void remove_a_person() throws Throwable {
            WebElement removeBtn = driver.findElement(By.cssSelector("span[onclick='deletePerson(3)']"));
            removeBtn.click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        WebElement resetBtn = driver.findElement(By.xpath("//button[text()='Reset List']"));
        resetBtn.click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        WebElement clearBtn = driver.findElement(By.cssSelector("button#addPersonBtn"));
        clearBtn.click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
//text field are empty:
        Assert.assertEquals("", driver.findElement(By.id("name")).getText());
        Assert.assertEquals("", driver.findElement(By.id("surname")).getText());
        Assert.assertEquals("", driver.findElement(By.id("job")).getText());
        Assert.assertEquals("", driver.findElement(By.id("dob")).getText());

//gender button check:
        Assert.assertFalse(driver.findElement(By.id("male")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("female")).isSelected());
//Employee status default ="Employee".
// (I've already identified this object in code line 95-96, but here it's not recognized, so I had to repeat, although seems inefficient)
        Select obj = new Select(driver.findElement(By.id("status")));
        Assert.assertEquals("Employee", obj.getFirstSelectedOption().getText());
//English remains selected, this assert will be failed, if assertFalse is chosen
        Assert.assertTrue(driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("spanish")).isSelected());
    }
}
