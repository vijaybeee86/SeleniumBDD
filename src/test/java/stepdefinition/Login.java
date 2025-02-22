package stepdefinition;

import DriverFactory.DriverInstance;
import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.LoginPage;

public class Login {

    LoginPage login = new LoginPage();

//    public Login()
//    {
//
//    }
    @Given("^user launch the browser successfully$")
    public void userLaunchTheBrowserSuccessfully() {
        try {
            DriverInstance.getInstance().get("https://www.saucedemo.com/");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @When("^user enters the username (.+)$")
    public void userEntersTheUserName(String uname) {
        try {
            login.enterUName(uname);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @And("^user enters the password (.+)$")
    public void userEntersThePassword(String pwd) {
        try {
            login.enterPwd(pwd);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @And("^user clicks the login button$")
    public void userClicksTheLoginButton() {
        try {
            login.clickLoginBtn();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Then("^user login to the application successfully$")
    public void userLoginToTheApplicationSuccessfully() {
        try {
            String cUrl = DriverInstance.getInstance().getCurrentUrl();
            if(cUrl.equalsIgnoreCase("https://www.saucedemo.com/inventory.html")){
                System.out.println("User loggedin the application successfully");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Then("^user fail to login to the application$")
    public void userFailToLoginToTheApplication() {
        try {
            String cUrl = DriverInstance.getInstance().getCurrentUrl();
            if(!(cUrl.equalsIgnoreCase("https://www.saucedemo.com/inventory.html"))) {
                System.out.println("Fail to login the application");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @And("user login to the application successfully with valid credentials")
    public void userLoginToTheApplicationSuccessfullyWithValidCredentials() {
    }
}
