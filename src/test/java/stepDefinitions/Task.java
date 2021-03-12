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

import java.util.List;

public class Task {
    private WebDriver driver;

    public Task() {
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
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html//input[@id='english']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg5+"']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg6+"']")).click();
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        opt.selectByVisibleText(arg7);



    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        driver.findElement(By.id("modal_button")).click();
    }

    @When("^click on edit button$")
    public void click_on_edit_button() throws Throwable {
        driver.findElement(By.cssSelector("#person3 > span.w3-closebtn.editbtn.w3-padding.w3-margin-right.w3-medium > i")).click();
    }

    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(arg1);
        driver.findElement(By.id("surname")).sendKeys(arg2);
        driver.findElement(By.id("job")).sendKeys(arg3);
        driver.findElement(By.id("dob")).clear();
        driver.findElement(By.id("dob")).sendKeys(arg4);
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html//input[@id='english']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg5+"']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg6+"']")).click();
        List<WebElement> chckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i=0; i<chckbox.size();i++){
            if(chckbox.get(i).isSelected()){
                chckbox.get(i).click();
            }
        }
        driver.findElement(By.xpath("/html//input[@id='"+arg5+"']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg6+"']")).click();
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        opt.selectByVisibleText(arg7);
        opt.selectByVisibleText(arg7);

    }

    @When("^click on edit-button$")
    public void click_on_edit_button2() throws Throwable {
        driver.findElement(By.xpath("//div[@class='w3-btn-group']/button[@onclick='editPerson(3)']")).click();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        driver.findElement(By.xpath("//span[@onclick='deletePerson(3)']")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/button[2]")).click();
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/button")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='name']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='surname']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='job']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='dob']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("spanish")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("/html//input[@id='male']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("/html//input[@id='female']")).isSelected());
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        Assert.assertEquals("Employee",opt.getFirstSelectedOption().getText());



    }
}
