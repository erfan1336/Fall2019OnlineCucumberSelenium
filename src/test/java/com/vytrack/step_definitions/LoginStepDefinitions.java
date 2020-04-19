package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the logging page")
    public void user_is_on_the_logging_page() {
        System.out.println("Open Login Page");
        String URL = ConfigurationReader.getProperty("qa3");
        Driver.getDriver().get(URL);
    }

    @When("user logs is as a sales manage")
    public void user_logs_is_as_a_sales_manage() {
        System.out.println("Login as a sales manager");

        loginPage.login("salesmanager110","UserUser123");
    }

    @When("user logs is as a store manage")
    public void user_logs_is_as_a_store_manage() {
        System.out.println("Login as a store manager");
        loginPage.login("storemanager85","UserUser123");
    }

    @Then("user should verify that title is a Dashboard")
    public void user_should_verify_that_title_is_a_Dashboard() {
        System.out.println("Verify the title ");
        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());
        Driver.closeDriver();

    }

    //    When user enters "storemanager85" username and "UserUser123" password
    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        System.out.printf("Login with user name % and % password", string, string2);
        loginPage.login(string,string2);
    }


    @When("user navigates to {string} and {string}")
    public void user_navigates_to_and(String tab, String module) {
        System.out.printf("User clicks on the %s tab and navigates to %s module\n", tab, module);
        loginPage.navigateTo(tab, module);
    }
}
