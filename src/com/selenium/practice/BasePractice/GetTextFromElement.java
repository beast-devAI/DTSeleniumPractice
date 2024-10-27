package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromElement {

    final static String appURL = "https://omayo.blogspot.com/";
    static String paraTextLocator = "div[id^='post-body'][itemprop*='description']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize(); // Maximizing the current window
        driver.manage().deleteAllCookies(); // Deleting all the cookies for current session
        Thread.sleep(5000); // Wait for 5 seconds

        String paraTextDisplay = driver.findElement(By.cssSelector(paraTextLocator)).getText();

        paraTextDisplay.concat("Ducat India");

        System.out.println(paraTextDisplay);

        System.out.println(paraTextDisplay.concat("Ducat India"));


    }


}
