package com.gamesys.framework;

import Utilities.readPropConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by Radha on 11/12/2018.
 */
public class BaseSetup {
    WebDriver driver;
    readPropConfig readprop = new readPropConfig();

    public BaseSetup(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebDriver LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver", readprop.getConfig("Chrome"));
        driver=new ChromeDriver();
        String URL = readprop.getConfig("URL");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        return driver;
    }



}
