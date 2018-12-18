package PageObject;

import Utilities.readPropConfig;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
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

    WebDriver driver;
    readPropConfig readprop = new readPropConfig();
    private final Logger logger = LoggerFactory.getLogger(LoginPage.class);

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(how = How.XPATH , using = "//input[@id='field-username']")
    protected WebElement user_name;

    @FindBy(how = How.XPATH , using = "//input[@id='field-password']")
    protected WebElement password;

    @FindBy(how = How.XPATH , using = "//button[@type='submit']")
    protected WebElement submit;

    //@FindBy(how = How.XPATH , using = ".//div[@class='error-message']/*[@class='output']")
    @FindBy(how = How.CSS , using = "//div[class='output']")
    protected WebElement err_message;

    @FindBy(how = How.XPATH , using = "//button[@title='Open the menu']")
    protected WebElement home;


    public void InvalidLogin()
    {
        logger.info("Inside Login Page - Performing Invalid Login");

        user_name.sendKeys(readprop.getConfig("InvalidUsername"));
        password.sendKeys(readprop.getConfig("Password"));
        submit.click();
    }

    public void validate_invalidLogin(){
        String script = "return window.getComputedStyle(document.querySelector('.output'),':before').getPropertyValue('background')";
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String content = (String) js.executeScript(script);
        System.out.println(content);

        //if (err_message.getAttribute("data-qa").equalsIgnoreCase("login-form__error-message")) {
        if (content.contains(readprop.getConfig("invalid_login_err_message"))){
            Assert.assertTrue("Login with Invalid user details throwing error message - successful", true);
            logger.info("Inside Login Page -  Invalid Login test is successful");
        }else{
            Assert.fail("Login with Invalid user details - failed");
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


    public void validate_validLogin() {
        String homelink = null;
        try {
            homelink = home.getText();
        } catch (Exception ex) {
            Assert.fail("Login with valid user details - failed");
            logger.info("Inside Login Page -  Valid Login test failed");
        }
        if (homelink != null) {
            if (homelink.equalsIgnoreCase(readprop.getConfig("homelink_text"))) {
                Assert.assertTrue("Login with valid user redirected to the home page - successful", true);
                logger.info("Inside Login Page -  valid Login test is successful");
            } else {
                Assert.fail("Login with valid user details - failed");
                logger.info("Inside Login Page -  Valid Login test failed");
            }
        }
    }
}
