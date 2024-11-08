package com.selenium.practice.Intermediate;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalAlertsPopups {

    // locators of Simple Modal

    final static String appURL = "https://practice-automation.com/modals/";
    final static String loc_btn_SimpleModal = "button#simpleModal";
    final static String loc_btn_FormModal = "button#formModal";
    final static String loc_Title_SimpleModal = "div#pum_popup_title_1318";
    final static String loc_Btn_Close_SimpleModal = "div#popmake-1318 button.pum-close.popmake-close";


    // locators of Form Modal


    final static String loc_Title_FormModal = "div#pum_popup_title_674";
    final static String loc_Btn_Close_FormModal = "div#popmake-674 button.pum-close.popmake-close";
    final static String loc_name_inputField_FormModal = "input[id$='name']";
    final static String loc_email_inputField_FormModal = "input[id$='email']";
    final static String loc_message_textArea_FormModal = "textarea[id$='message']";
    final static String loc_btn_Submit_FormModal = "button.pushbutton-wide";




    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize();

        // Simple Modal actions (get titile and close the modal popup)

        /*
        driver.findElement(By.cssSelector(loc_btn_SimpleModal)).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(loc_Title_SimpleModal)).getText());
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(loc_Btn_Close_SimpleModal)).click();
         */

       //Form Modal (get title, fill form, submit form, cancel the form )

        /*
        driver.findElement(By.cssSelector(loc_btn_FormModal)).click();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector(loc_Title_FormModal)).getText());
        driver.findElement(By.cssSelector(loc_name_inputField_FormModal)).sendKeys("Test Name");
        driver.findElement(By.cssSelector(loc_email_inputField_FormModal)).sendKeys("Test@test.com");
        driver.findElement(By.cssSelector(loc_message_textArea_FormModal)).sendKeys("Hi this is the demo for modal popups");
        driver.findElement(By.cssSelector(loc_btn_Submit_FormModal)).click();
      //driver.findElement(By.cssSelector(loc_Btn_Close_FormModal)).click();
         */

    }

}