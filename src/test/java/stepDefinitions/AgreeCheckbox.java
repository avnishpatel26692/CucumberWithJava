package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgreeCheckbox {
  private WebDriver driver;

  public AgreeCheckbox() {
    this.driver = Hooks.driver;
  }

  @Given("^I am on the checkout$")
  public void i_am_on_the_checkout() throws Throwable
 {

    driver.get("http://www.demoshop24.com/index.php?route=checkout/checkout");
  }


  @Then("^I click at checkbox Agree Terms$")
  public void i_click_at_checkbox_Agree_Terms() throws Throwable {
    WebElement agreeTermsCheckbox = driver.findElement(By.className("form-control"));
    agreeTermsCheckbox.click();

  }

  @Then("^I click on Continue button$")
  public void i_click_on_Continue_button() throws Throwable {
    WebElement continueBtn = driver.findElement(By.cssSelector("Continue"));
    continueBtn.click();

  }

  @Then("^I find confirm button$")
  public void i_find_confirm_button() throws Throwable {
    WebElement confirmBtn = driver.findElement(By.cssSelector("Confirm Order"));

  }


  @Then("^I see a warning message$")
  public void i_see_a_warning_message() throws Throwable {
    WebElement alert = driver.findElement(By.cssSelector("alert alert-danger"));

  }

}