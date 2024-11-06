package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo {

    final static String appURL = "https://omayo.blogspot.com/";
    static String loc_DropDown = "select[id^='drop'][name='SiteMap']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        WebElement dropdownBaseElement = driver.findElement(By.cssSelector(loc_DropDown));

        Select sel = new Select(dropdownBaseElement);

        // Select By Index, index starts with 0

        sel.selectByIndex(3);
        Thread.sleep(8000);
        sel.selectByIndex(0);

        // By Visible Text, visible text in dropdown

         sel.selectByVisibleText("doc 3");

         // Select By Value i.e. value attribute of options

         sel.selectByValue("abc");

        // Getting dropdown options

          for (WebElement elem : sel.getOptions()) {

            System.out.println(elem.getText());

          }

    }
}