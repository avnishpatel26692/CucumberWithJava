package stepDefinitions;


import cucumber.api.DataTable;
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

public class ThreeColumnTable {


    /**
     *
     */
    public ThreeColumnTable() {
        }
    @Given("^I have the following order$")
    public void i_have_the_following_order(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for (Map<String, String> map : arg1.asMaps(String.class, String.class)) {
            String vegetableName = map.get("vegetable"); //cucumber
            String quantity = map.get("quantity"); //4
            String price = map.get("cost"); //10
            System.out.println("Vegetable Name : " + vegetableName);
            System.out.println("Quantity : " + quantity);
            System.out.println("Cost : " + price);
        }
    }
}