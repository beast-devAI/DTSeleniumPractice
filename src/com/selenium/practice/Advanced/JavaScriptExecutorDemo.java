package com.selenium.practice.Advanced;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

    final static String appURL_BB = "https://www.bigbasket.com/";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();


        driver.get(appURL_BB);
        driver.manage().window().maximize();
       // String script1 = "window.scrollBy(0,document.body.scrollHeight)";
        String alertDemo = "alert('This is my JS demo');";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(8000);
        //js.executeAsyncScript(script1);
        js.executeScript(alertDemo);


    }
}
