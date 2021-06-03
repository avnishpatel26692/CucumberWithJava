package stepDefinitions;

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
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.sql.Driver.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class Demoshoplogin {
  private WebDriver driver;

  public Demoshoplogin()  {
    this.driver = new WebDriverLib();
  }

  @Given("^User navigate to Demoshop homepage$")
  public void user_navigate_to_Demoshop_homepage() throws Throwable {
    driver.get("http://www.demoshop24.com/index.php?route=account/login");

  }

  @Then("^User enter user name$")
  public void user_enter_user_name() throws Throwable
  {
    WebElement emailField = driver.findElement(By.id("input-email"));
    emailField.sendKeys("testtest@demo.com");
  }

  @Then("^User enter password$")
  public void user_enter_password() throws Throwable {
    WebElement passwordField = driver.findElement(By.id("input-password"));
    passwordField.sendKeys("testtesttest" + Keys.ENTER);
  }

  @Then("^User is logged in$")
  public void user_is_logged_in() throws Throwable {
    String url = driver.getCurrentUrl();
    Assert.assertEquals("http://www.demoshop24.com/index.php?route=account/account", url);


  }

}
