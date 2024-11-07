package com.selenium.practice.Intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertHandling {

    final static String appURL = "https://the-internet.herokuapp.com/javascript_alerts";
    final static String loc_JS_Alert = "//button[contains(text(),'Click for JS Alert')]";
    final static String loc_JS_Confirm = "//button[contains(text(),'Click for JS Confirm')]";
    final static String loc_JS_Prompt = "//button[contains(text(),'Click for JS Prompt')]";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        // javaScript Alert Handling (accept, dismiss & get popup text)

        /*
        driver.findElement(By.xpath(loc_JS_Alert)).click();
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(8000);
        al.accept();
        al.dismiss();
        */

        //  JavaScript confirm popup (accept, dismiss & get popup text)

        /*
        driver.findElement(By.xpath(loc_JS_Confirm)).click();
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(8000);
        al.accept();
        al.dismiss();
        */

        //  JavaScript prompt popup (accept, dismiss, get popup text & send data to alert)

        /*
        driver.findElement(By.xpath(loc_JS_Prompt)).click();
        Alert al = driver.switchTo().alert();
        System.out.println(al.getText());
        Thread.sleep(8000);
        al.sendKeys("Hi this is Alert Demo");
        al.accept();
        al.dismiss();
         */


    }

}
