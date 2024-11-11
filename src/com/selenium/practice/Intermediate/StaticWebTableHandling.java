package com.selenium.practice.Intermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticWebTableHandling {


    final static String appURL_Omayo = "https://omayo.blogspot.com/";
    final static String tableBaseLoc = "table#table1";
    final static String tableRowLoc = "table#table1 tr";
    final static String tableDataLoc = "table#table1 tr td";

    final static int rowNum = 2;
    final static int cellNum = 1;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL_Omayo);
        driver.manage().window().maximize();

        System.out.println("Total rows in table are:" + driver.findElements(By.cssSelector(tableRowLoc)).size());

/*
        List<WebElement> tableData = driver.findElements(By.cssSelector(tableDataLoc));

        for (WebElement el : tableData) {

            System.out.println(el.getText());

        }
*/



       List <WebElement> row=driver.findElements(By.tagName("tr"));

/*
       for(WebElement rowElem:row) {

          List<WebElement> cell = rowElem.findElements(By.tagName("td"));

          for(WebElement cellData:cell){

              System.out.print(cellData.getText()+"\t");
          }

           System.out.println();
       }
*/
       // List<WebElement> cell=driver.findElements(By.tagName("td"));

        // getting cell data

        System.out.println( row.get(rowNum).findElements(By.tagName("td")).get(cellNum).getText());




    }
}








