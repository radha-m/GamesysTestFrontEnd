package PageObject;

import Utilities.readPropConfig;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by Radha on 11/12/2018.
 */
public class LoginPage {

    readPropConfig readprop = new readPropConfig();
    private final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
    @FindBy(how = How.XPATH , using = "//input[@id='field-username']")
    protected WebElement user_name;

    @FindBy(how = How.XPATH , using = "//input[@id='field-password']")
    protected WebElement password;

    @FindBy(how = How.XPATH , using = "//button[@type='submit']")
    protected WebElement submit;

    @FindBy(how = How.CSS , using = ".div[class=output]']")
    protected WebElement err_message;

    @FindBy(how = How.XPATH , using = "//a[contains(text(),'Home')]")
    protected WebElement home;


    public void InvalidLogin()
    {
        logger.info("Inside Login Page - Performing Invalid Login");

        user_name.sendKeys(readprop.getConfig("InvalidUsername"));
        password.sendKeys(readprop.getConfig("Password"));
        submit.click();
    }

    public void validate_invalidLogin(){
        if (err_message!= null) {
            Assert.assertTrue("Login with Invalid user details throwing error message - successful", true);
            logger.info("Inside Login Page -  Invalid Login test is successful");
        }else{
            Assert.assertTrue("Login with Invalid user details - failed", false);
            logger.info("Inside Login Page -  Invalid Login test failed");
        }
    }

    public void ValidLogin()
    {
        logger.info("Inside Login Page - Performing Valid Login");

        user_name.sendKeys(readprop.getConfig("validUsername"));
        password.sendKeys(readprop.getConfig("Password"));
        submit.click();
    }


    public void validate_validLogin(){
        if (home!= null) {
            Assert.assertTrue("Login with valid user redirected to the home page - successful", true);
            logger.info("Inside Login Page -  valid Login test is successful");
        }else{
            Assert.assertTrue("Login with valid user details - failed", false);
            logger.info("Inside Login Page -  Valid Login test failed");
        }
    }
}
