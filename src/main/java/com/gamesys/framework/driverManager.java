package com.gamesys.framework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.readPropConfig;


/**
 * Created by Radha on 10/12/2018.
 */

public  class driverManager {

    readPropConfig readprop = new readPropConfig();

    public WebDriver createDriver(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", readprop.getConfig("Chrome"));
        driver=new ChromeDriver();
        return driver;

    }


}
