package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class SampleSteps {
    private WebDriver driver;

    public SampleSteps() {
        this.driver = Hooks.driver;
    }

    @Given("^I am on the home page$")
    public void I_Am_On_The_Home_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site");
    }

    @Then("^I should see home page header$")
    public void i_Should_See_Home_Page_Header() throws Throwable {
        Assert.assertEquals("This is a home page",
                driver.findElement(By.cssSelector("h1")).getText());
    }

    @And("^I should see home page description$")
    public void i_Should_See_Home_Page_Description() throws Throwable {
        Assert.assertEquals("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
               driver.findElement(By.cssSelector("p")).getText());
    }

    @And("^I should see menu$")
    public void i_Should_See_Menu() throws Throwable {
       Assert.assertTrue(driver.findElement(By.className("w3-navbar")).isDisplayed());
    }

    @When("^User navigates to Link Page$")
    public void User_navigates_to_Link_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/po");
    }

    @Then("^User should be verified page is opened correctly$")
        public void   User_should_be_verified_page_is_opened_correctly () throws Throwable{
        Assert.assertEquals("This is a home page", driver.findElement((By.cssSelector("h1")).getText());
    }

    @Given ("^User navigates to Age Page$")
    public void User_navigates_to_Age_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/age");

    }
    @When ("^User enter name"$")
    public void User_enter_name(String arg1) throws Throwable {
        WebElement nameText = driver.findElement(By.id("name"));
        nameText.sendKeys(arg1);
    }
    @And ("^User enter age $")
    public void User_enter_age(int arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.name("age"));
        ageText.sendKeys("" +arg1);
    }

    @And ("^Click on Submit button$")
    public void Click_on_Submit_button() throws Throwable {
        driver.findElement(By.id("submit")).click();
    }

@Then ("^User see message$")
    public void User_see_message(String arg1) throws Throwable {
    Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
    }

    @Given ("^User on Number Page$")
    public void Useer_on_Number_Page() throws Throwable {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }
@When ("^User enter number:$")
    public void User_enter_number:(String arg1) throws Throwable {
        WebElement ageText = driver.findElement(By.id("numb"));
        ageText.sendKeys();
    }
    @And ("^User click submit button$")
    public void User_click_submit_button() throws Throwable {
        driver.findElement((By.ByClassName("w3-btn w3-orange w3-margin")).click();
    }
@Then ("^User sees message:$")
    public void User_sees_message:(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.id("ch1_error")).getText());
    }
    @Then ("^User sees message:$")
    public void User_sees_message:(String arg2) throws Throwable {
        Assert.assertEquals((arg2, driver.switchTo().alert().getText()));
    }

    @Given ("^I am on action page$")
    public void I_am_on_action_page() throws Throwable {
        driver.get("https://kristinek.github.io/site/examples/actions");
    }


    @When("^I clicked on checkboxes:$")
    public void i_clicked_on_checkboxes(List<String> arg1) throws Throwable {
        for(String value : arg1)
        {
            String Start_xpath = "//input[@type='checkbox'][@value='";
            String checkboxName = value;
            String end_xpath = "']";
            String xpath = Start_xpath + checkboxName + end_xpath;
            System.out.println("Xpath : " + xpath);
            driver.findElement(By.xpath(xpath)).click();
        }
        @And ("^I click the result checkbox button$")
                public void I_click_the_result_checkbox_button() throws Throwable {
            driver.findElement((By.id("result_button_checkbox")).click());

        }
        @Then ("^message for checkboxes")
                public void message_for_checkboxes_is_seen(String arg1) throws Throwable {
            Assert.assertEquals(arg1, driver.findElement(By.id("result_checkbox")).getText());
        }
////sample5feature

       @Given  ("^User navigates to Age Page$")
        public void User_navigates_to_Age_Page() throws Throwable {
            driver.get("https://kristinek.github.io/site/examples/age");

        @When("^User enter details$")
        public void user_enter_details(Map<String, String> arg1) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            for(Map.Entry<String, String> map : arg1.entrySet())
            {
                String mapKey = map.getKey(); //name , age
                String mapValue = map.getValue(); //Ann , 5
                WebElement element = driver.findElement(By.id(mapKey));
                element.clear();
                element.sendKeys(mapValue);
            }
        }
        @And ("^Click on Submit button$")
            public void Click_on_Submit_button() throws Throwable {
                driver.findElement(By.id("submit")).click();

    }
          @Then  ("^User see message :$")
            public void User_see_message(String arg1) throws Throwable {
                Assert.assertEquals(arg1, driver.findElement(By.id("message")).getText());
            }
///3column
            @Given("^I have the following order$")
            public void i_have_the_following_order(DataTable arg1) throws Throwable {
                // Write code here that turns the phrase above into concrete actions
                for(Map<String, String> map: arg1.asMaps(String.class, String.class))
                {
                    String vegetableName = map.get("vegetable"); //cucumber
                    String quantity = map.get("quantity"); //4
                    String price = map.get("cost"); //10
                    System.out.println("Vegetable Name : " +vegetableName);
                    System.out.println("Quantity : " +quantity);
                    System.out.println("Cost : " +price);
                }


}





