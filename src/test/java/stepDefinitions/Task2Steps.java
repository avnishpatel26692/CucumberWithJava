package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task2Steps {
    private WebDriver driver;

    public Task2Steps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on Employee page$")
    public void i_am_on_Employee_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://kristinek.github.io/site/tasks/list_of_people");
    }

    @When("^click on Add person$")
    public void click_on_Add_person() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@id='addPersonBtn']")).click();

    }

    @When("^fill all fields: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void fill_all_fields(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {

        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html//input[@id='name']")).sendKeys(arg1);
        driver.findElement(By.xpath("/html//input[@id='surname']")).sendKeys(arg2);
        driver.findElement(By.xpath("/html//input[@id='job']")).sendKeys(arg3);
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(arg4);
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html//input[@id='english']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg5+"']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg6+"']")).click();
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        opt.selectByVisibleText(arg7);


    }

    @Then("^click button add$")
    public void click_button_add() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html//button[@id='modal_button'][text()='Add']")).click();
    }


    @When("^edit something: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void edit_something(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html//input[@id='name']")).clear();
        driver.findElement(By.xpath("/html//input[@id='name']")).sendKeys(arg1);
        driver.findElement(By.xpath("/html//input[@id='surname']")).clear();
        driver.findElement(By.xpath("/html//input[@id='surname']")).sendKeys(arg2);
        driver.findElement(By.xpath("/html//input[@id='job']")).clear();
        driver.findElement(By.xpath("/html//input[@id='job']")).sendKeys(arg3);
        driver.findElement(By.xpath("/html//input[@id='dob']")).clear();
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(arg4);
        driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(Keys.ENTER);

        List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(int i=0; i<chkbox.size();i++){
            if(chkbox.get(i).isSelected()){
                chkbox.get(i).click();
            }
        }
        driver.findElement(By.xpath("/html//input[@id='"+arg5+"']")).click();
        driver.findElement(By.xpath("/html//input[@id='"+arg6+"']")).click();
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        opt.selectByVisibleText(arg7);
    }

    @When("^click on edit-button$")
    public void click_on_edit_button() throws Throwable {
        //ul[@id='listOfPeople']/div[1]/li//i[@class='fa fa-pencil']
        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//ul[@id='listOfPeople']/div[1]/li//i[@class='fa fa-pencil']")).click();
        driver.findElement(By.xpath("//button[@id='modal_button'][text()='Edit'][1]")).click();
    }

    @When("^remove a person$")
    public void remove_a_person() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//ul[@id='listOfPeople']/div[1]/li/span[.='×']")).click();
    }

    @Then("^reset list$")
    public void reset_list() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//body/div[4]/button[2]"));
    }

    @When("^click clear-button$")
    public void click_clear_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[@id='addPersonBtn'][text()='Clear all fields']")).click();
    }

    @Then("^check empty fields$")
    public void check_empty_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='name']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='surname']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='job']")).getText().isEmpty());
        Assert.assertTrue(driver.findElement(By.xpath("/html//input[@id='dob']")).getText().isEmpty());
        driver.findElement(By.xpath("/html//input[@id='english']")).click();
        Assert.assertFalse(driver.findElement(By.id("english")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("french")).isSelected());
        Assert.assertFalse(driver.findElement(By.id("spanish")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("/html//input[@id='male']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("/html//input[@id='female']")).isSelected());
        Select opt = new Select(driver.findElement(By.xpath("/html//select[@id='status']")));
        Assert.assertEquals("Employee",opt.getFirstSelectedOption().getText());
    }

    @When("^click on edit button$")
    public void click_on_edit_button2() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        driver.findElement(By.xpath("//button[@id='modal_button'][text()='Edit'][1]")).click();
        driver.findElement(By.xpath("//ul[@id='listOfPeople']/div[1]/li//i[@class='fa fa-pencil']")).click();
    }

}



