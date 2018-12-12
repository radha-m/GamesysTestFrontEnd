package Steps;


import com.gamesys.framework.BaseSetup;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import PageObject.HomePage;
import PageObject.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Utilities.TakeScreenShot;


/**
 * Created by Radha on 11/12/2018.
 */
public class LoginStep {
    WebDriver driver;
    BaseSetup setup;
    HomePage home_page;
    LoginPage login;
    TakeScreenShot scrnshot = new TakeScreenShot();


    private final Logger logger = LoggerFactory.getLogger(LoginPage.class);


    @Given("^I have opened Virgin Games URL in browser$")
    public void openVirginGamesURL() throws Throwable {
        logger.info("Initial Setup");
        setup = new BaseSetup(driver);
        driver = setup.LaunchBrowser();
        scrnshot.takeSnapShot(driver,"Browser Launch");
    }

    @Given("^I navigates the user login$")
    public void gotologin() throws Throwable {
        logger.info("Navigated to LoginPage");
        home_page=new HomePage(driver);
        home_page.login_click();
        scrnshot.takeSnapShot(driver,"Home Page");
    }

    @When("^I enter invalid user credentials$")
    public void enterWrongCredentials() throws Throwable {
        logger.info("InValid Credential - Login");
        login = new LoginPage(driver);
        login.InvalidLogin();
        scrnshot.takeSnapShot(driver,"LoginPage - Invalid");
    }

    @Then("^I should be presented with login failed error message$")
    public void validateErrorMessage() throws Throwable {
        login.validate_invalidLogin();
        logger.info("Invalid Login Test Completed");
        scrnshot.takeSnapShot(driver,"LoginPage - Invalid - Error Message");
        setup.closeBrowser(driver);
        logger.info("closing the browser");
    }

    @When("^I enter valid user credentials$")
    public void enterValidCredentials() throws Throwable {
        logger.info("Valid Credential - Login");
        login = new LoginPage(driver);
        login.ValidLogin();
        scrnshot.takeSnapShot(driver,"LoginPage - valid ");
    }

    @Then("^I should be successfully log in$")
    public void validateLogin() throws Throwable {
        login.validate_invalidLogin();
        logger.info("Valid Login Test Completed");
        scrnshot.takeSnapShot(driver,"LoginPage - valid - Home Page");
        setup.closeBrowser(driver);
        logger.info("closing the browser");
    }

}
