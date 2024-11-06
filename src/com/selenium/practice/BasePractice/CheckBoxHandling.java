package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CheckBoxHandling {


    final static String appURL = "https://omayo.blogspot.com/";
    static String loc_ChkBox_Orange = "input[value='orange']";
    static String loc_ChkBox_Blue = "input[value='blue']";
    static String baseChkBox_Loc_Color = "//div/input[@name='color']";
    static String baseChkBox_Loc_Accessories = "div>input[name='accessories']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        // Case #1 : Targetting individual elements

        //  driver.findElement(By.cssSelector(loc_ChkBox_Blue)).click();
        // driver.findElement(By.cssSelector(loc_ChkBox_Orange)).click();

        List<WebElement> Chk_Bx_Clr = driver.findElements(By.xpath(baseChkBox_Loc_Color));

        //case #2 : selected element display
/*
        for (WebElement el : Chk_Bx_Clr) {

            el.click();

            if (el.isSelected()) {

                System.out.println("Selected checkboc is" + " : " + el.getAttribute("value"));

            }


        }
*/

// case #3 : Show selected element name and selecting the not selected ones

        List<WebElement> Chk_Bx_Accessories = driver.findElements(By.cssSelector(baseChkBox_Loc_Accessories));

        for (WebElement elem : Chk_Bx_Accessories) {

            if (elem.isSelected()) {

                System.out.println("Selected Checkbox is : " + "" + elem.getAttribute("value"));
                elem.click();
            } else {

                elem.click();
                //elem.click();
            }

        }


    }
}
