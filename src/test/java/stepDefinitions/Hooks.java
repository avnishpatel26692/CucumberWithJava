package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.net.MalformedURLException;

public class Hooks {
    public static WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "\\lib\\";

    @Before
    public void openBrowser() throws MalformedURLException {
        //Run in Chrome
//        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver.exe");
//        driver = new ChromeDriver();
//
//        //Run test in Firefox
        System.setProperty("webdriver.gecko.driver",libWithDriversLocation + "geckodriver.exe");
        driver = new FirefoxDriver();

//        Run test in IE Browser
//        System.setProperty("webdriver.ie.driver",libWithDriversLocation + "IEDriverServer.exe");
//        driver = new InternetExplorerDriver();

        driver.manage().deleteAllCookies();
    }

    @After
    public void embedScreenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        Thread.sleep(2500);
        driver.quit();
    }
}
