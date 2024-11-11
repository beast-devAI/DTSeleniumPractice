package com.selenium.practice.Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    final static String appURL_Heroku = "https://the-internet.herokuapp.com/key_presses";
    final static String appURL_AutomationExercise = "https://www.automationexercise.com/";
    final static String loc_btn_DoubleClick = "//button[contains(text(),'Double click')]";
    final static String loc_Menu_Hover = "span#blogsmenu";
    final static String loc_Submenu = "//span[contains(text(),'Selenium143')]";
    // final static String loc_lastElement_page = "p[title='Free Selenium tutorials']";
       final static String loc_lastElement_page = "button[value='LogIn']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        // Double Click and dismiss the alert

        /*
        act.doubleClick(driver.findElement(By.xpath(loc_btn_DoubleClick)))
         .build()
            .perform();
         driver.switchTo().alert().dismiss();
         */


        // Hover

        /*
        act.moveToElement(driver.findElement(By.cssSelector(loc_Menu_Hover)))
                .click(driver.findElement(By.xpath(loc_Submenu)))
                .build()
                .perform();
         */


        //Scroll
        /*
       act.scrollToElement(driver.findElement(By.cssSelector(loc_lastElement_page)))
               .build()
                .perform();
         */

        // right click

        /*

        act.contextClick().build().perform();

         */


    }

}
