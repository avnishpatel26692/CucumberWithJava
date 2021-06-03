package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class calculatorTest {


  //Tests google calculator
  public void googleCalculator(){

    //Creating a driver object referencing WebDriver
    WebDriver driver;

    //Setting the webdriver.chrome.driver property to its executable's location
    System.setProperty("webdriver.chrome.driver", "/lib/chromedriver.exe");

    //Instantiating driver
    driver = new ChromeDriver();

    //Set implicit wait of 10 seconds
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    //Launch google
    driver.get("http://www.google.co.in");

    //Write 2+2 in google textbox
    WebElement googleTextBox = driver.findElement(By.id("gbqfq"));
    googleTextBox.sendKeys("2+2");

    //Click on searchButton
    WebElement searchButton = driver.findElement(By.id("gbqfb"));
    searchButton.click();

    //Get result from calculator
    WebElement calculatorTextBox = driver.findElement(By.id("cwos"));
    String result = calculatorTextBox.getText();

    //Verify that result of 2+2 is 4
    Assert.assertEquals(result, "4");
  }

}

