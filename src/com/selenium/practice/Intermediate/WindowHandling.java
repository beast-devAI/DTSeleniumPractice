package com.selenium.practice.Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class WindowHandling {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();

        //

        String baseWinHandle = driver.getWindowHandle();
        System.out.println("Base Window Handle ID: " + baseWinHandle);

       /*
        driver.findElement(By.linkText("Open a popup window")).click();
        Set<String> totalWinHandles = driver.getWindowHandles();
        System.out.println("Total Windows opened: " + totalWinHandles.size());

        for (String str : totalWinHandles) {

            if (!str.equals(baseWinHandle)) {
                driver.switchTo().window(str);
                System.out.println(driver.getCurrentUrl());
            }
        }
        driver.switchTo().window(baseWinHandle);
        System.out.println(driver.getCurrentUrl());
           */

        driver.findElement(By.linkText("Open a popup window")).click();
        new Actions(driver)
                .click(driver.findElement(By.linkText("SeleniumTutorial")))
                .build()
                .perform();


        Set<String> tabWindows = driver.getWindowHandles();

        System.out.println(tabWindows.size());

        for(String str:tabWindows){

            if (!str.equals(baseWinHandle)){

                driver.switchTo().window(str);
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                Thread.sleep(8000);
               // driver.close();
            }



        }
        driver.switchTo().window(baseWinHandle);
        System.out.println(driver.getCurrentUrl());

    }
}