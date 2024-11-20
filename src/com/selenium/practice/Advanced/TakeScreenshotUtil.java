package com.selenium.practice.Advanced;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TakeScreenshotUtil {


    final static String appURL_Omayo = "https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        //driver.manage().window().maximize();


        TakesScreenshot ts=(TakesScreenshot)driver;
        File srcfle=ts.getScreenshotAs(OutputType.FILE);
       File destFile=new File("resources/test.png");
       FileUtils.copyFile(srcfle,destFile);



    }

}
