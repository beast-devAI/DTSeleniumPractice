package com.selenium.practice.Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsInputSequence {

    final static String appURL = "https://the-internet.herokuapp.com/key_presses";
    final static String loc_TextArea = "input#target";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        act.click(driver.findElement(By.cssSelector(loc_TextArea)))
                .sendKeys("Hi")
                  .sendKeys(" ")
                    .sendKeys("This")
                      .sendKeys(" ")
                        .sendKeys("is")
                          .sendKeys(" ")
                            .sendKeys("Test")
                              .sendKeys(" ")
                                 .sendKeys("Input Sequence")
                                    .build()
                                       .perform();


    }

}
