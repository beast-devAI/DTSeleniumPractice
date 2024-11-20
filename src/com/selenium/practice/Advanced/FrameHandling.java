package com.selenium.practice.Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    final static String appURL_Internet = "https://the-internet.herokuapp.com/nested_frames";

    static String imgsrc = "img[src='https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgvfAS_-DIZkDOBofcg5ccWImZT6pfXQKGsdiw8n8ylKZdB-Z7re-hcZJ5LgU7JzbdJm1PPD4qmOpKiQ-Koc8VAc4vZYjb1byRZaV_tTiDUjXWEENIIadCX9khQZPFOxJotXnr-XJEWlCt2pCvy4NpbL2RoU-appSL4Pot13fxQwElrVsav8f_c16fYW5D7/s285/2024-02-17_133326.png']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        // driver.get(appURL_Omayo);
        driver.get(appURL_Internet);
        driver.manage().window().maximize();

        /*

        int totalFrameCount = driver.findElements(By.tagName("iframe")).size();

        System.out.println(totalFrameCount);
        System.out.println(driver.findElements(By.tagName("iframe")).get(0).getAttribute("id"));
        System.out.println(driver.findElements(By.tagName("iframe")).get(1).getAttribute("id"));
        System.out.println(driver.findElements(By.tagName("iframe")).get(2).getAttribute("id"));

        for (WebElement elem : driver.findElements(By.tagName("iframe"))) {

            System.out.println(elem.getAttribute("id"));
        }

        driver.switchTo().frame("iframe2");

        System.out.println(driver.findElements(By.tagName("im")).size());

        for (WebElement el : driver.findElements(By.tagName("img"))) {

            el.click();

        }

*/

        /*
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("frameset")).getAttribute("rows"));
       */

        /*
        driver.switchTo().frame("frame-bottom");
        String bottonFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottonFrameText);
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText());
        */

        driver.switchTo().frame("frame-top")
                .switchTo().frame("frame-right")
                .switchTo().parentFrame().switchTo().frame("frame-middle");

        String bottonFrameText = driver.findElement(By.tagName("body")).getText();
        System.out.println(bottonFrameText);
        // driver.switchTo().parentFrame();
        // System.out.println(driver.findElement(By.tagName("body")).getText());

    }


}
