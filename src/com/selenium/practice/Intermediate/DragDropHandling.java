package com.selenium.practice.Intermediate;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropHandling {

    final static String appURL = "https://the-internet.herokuapp.com/drag_and_drop";
    final static String loc_Tile_A = "div#column-a";
    final static String loc_Tile_B = "div#column-b";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        Actions act = new Actions(driver);

        //WebElement of source A

        WebElement tileA = driver.findElement(By.cssSelector(loc_Tile_A));
        //WebElement of target B
        WebElement tileB = driver.findElement(By.cssSelector(loc_Tile_B));

        Thread.sleep(8000);
        act.dragAndDrop(tileA, tileB).build().perform();


    }
}
