package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static String loc_Radio_Female = "div>input[name='gender'][value='female']";
    static String loc_Radio_Male = "div>input[name='gender'][value='male']";
    static String base_Radio_loc = "div>input[name='gender']";
    static String bike_loc = "div>input[name='vehicle'][value='Car']";
    static String base_Vehicle_loc = "div>input[name='vehicle']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);

        /* Case #1: Selecting the specific radio button,
        to use it uncomment line 30 and 31 only */


        // driver.findElement(By.cssSelector(loc_Radio_Female)).click(); // female radio button
        //  driver.findElement(By.cssSelector(loc_Radio_Male)).click(); // male radio button

        /* Case #2: Selecting the base radio button locator,
        to use it, uncomment line 37 till 46  */

        /*

        List<WebElement> elemRadioBtn=driver.findElements(By.cssSelector(base_Radio_loc));

        for(WebElement el:elemRadioBtn) {
              el.click();
              Thread.sleep(5000);
         }

       */

         /* Case #2: Selecting the bike radio button locator,
              to use it, uncomment line 51 */

        // driver.findElement(By.cssSelector(bike_loc)).click(); // bike radio button


       List<WebElement> vehicleList = driver.findElements(By.cssSelector(base_Vehicle_loc));

       // Case #3: Displaying the value of already selected radio button, to use, uncomment line 58 till 68

    /*   for (WebElement elem : vehicleList) {

               if (elem.isSelected()) {

                System.out.println(elem.getAttribute("value"));

            }


        }  */



        //Case#4 : Clicking the element which is not already selected, to use, uncomment line 73 till 79

     /*   for (WebElement elem : vehicleList) {

            if (!elem.isSelected()) {
                elem.click();
            }

        } */



    }


}
