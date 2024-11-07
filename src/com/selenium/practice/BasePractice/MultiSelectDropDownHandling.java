package com.selenium.practice.BasePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDownHandling {


    final static String appURL = "https://omayo.blogspot.com/";
    final static String loc_MultiSelect_Dropdown = "select[id^='multiselect']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        Select sel = new Select(driver.findElement(By.cssSelector(loc_MultiSelect_Dropdown)));


        // Multiple Selection in select dropdown
/*
       sel.selectByVisibleText("Audi");
       sel.selectByVisibleText("Swift");
       sel.selectByVisibleText("Volvo");
       sel.selectByVisibleText("Hyundai");


 */

        // Getting the selected options

    /*

        List<WebElement> selectedOptions = sel.getAllSelectedOptions();

       for (WebElement el : selectedOptions) {

            System.out.println(el.getText());

       }


     */

        Thread.sleep(8000);

// Deselecting the selected options
        /*

        sel.deselectByIndex(1);

        sel.deselectAll();

         */

        // to show number of options


       /*
       System.out.println("Available number of options:"+""+sel.getOptions().size());

       for( WebElement elem :sel.getOptions()){

          System.out.println(elem.getText());


       }
       */

        // To check if dropdown allows multiple selection
        /*
         System.out.println(sel.isMultiple());
         */

// printing the first selected option from the list
        /*

        WebElement firstSelected=sel.getFirstSelectedOption();

        System.out.println(firstSelected.getText());
*/
    }
}