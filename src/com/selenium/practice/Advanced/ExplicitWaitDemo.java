package com.selenium.practice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitDemo {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    final static String valid_loc_textField = "textarea#ta1";


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();

        WebDriverWait waitdemo = new WebDriverWait(driver, Duration.ofSeconds(20));

        //driver.findElement(By.cssSelector("sdfsfds")).sendKeys("Imlicit Wait Demo");


        driver.findElement(By.cssSelector("button.dropbtn")).click();
        // driver.findElements(By.cssSelector("div#myDropdown>a")).get(2).click();

        waitdemo.until(ExpectedConditions.visibilityOf(driver.findElements(By.cssSelector("div#myDropdown>a")).get(2))).click();
    }
}
