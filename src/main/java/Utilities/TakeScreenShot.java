package Utilities;

import java.io.File;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
/**
 * Created by tharanibabu on 11/12/2018.
 */
public class TakeScreenShot {


    WebDriver driver ;
    public void takeSnapShot(WebDriver webdriver,String fileName) throws Exception{
         String FileLocation = "target/screenshots/";
         String FilewithPath = "";
         FilewithPath = FileLocation + fileName;

         TakesScreenshot scrShot =((TakesScreenshot)webdriver);
         File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
         File DestFile=new File(FilewithPath);
         FileUtils.copyFile(SrcFile, DestFile);

    }
}
