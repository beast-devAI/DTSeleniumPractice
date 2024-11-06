package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFileUpload {

    final static String appURL = "https://omayo.blogspot.com/";
    static String loc_File_Upload = "form>input[type='file']";
    final static String uploadFilePath="resources/SeleniumFileTestUpload.txt";
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(loc_File_Upload)).sendKeys(uploadFilePath);

    }
}

