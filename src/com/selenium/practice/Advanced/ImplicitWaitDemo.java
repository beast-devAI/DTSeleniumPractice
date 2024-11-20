package com.selenium.practice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitDemo {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    final static String valid_loc_textField="textarea#ta1";
    final static String invalid_loc_textField="TestDemo";

    public static void main(String[]args){

        WebDriver driver=new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector(valid_loc_textField)).sendKeys("Imlicit Wait Demo");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

         driver.findElement(By.cssSelector(invalid_loc_textField)).sendKeys("Imlicit Wait Demo");

    }
}
