package com.selenium.practice.BasePractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxHandling {

    final static String appURL = "https://omayo.blogspot.com/";
    static String txtFieldUID = "userid";
    static String txtFieldPWD = "pswrd";
    static String btnLogin = "form[name='login'] input[type='button']";

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get(appURL);
        driver.manage().window().maximize(); // Maximizing the current window
        driver.manage().deleteAllCookies(); // Deleting all the cookies for current session
        Thread.sleep(5000); // Wait for 5 seconds

        driver.findElement(By.name(txtFieldUID)).sendKeys("Hello");
        driver.findElement(By.name(txtFieldPWD)).sendKeys("demopwd");
        driver.findElement(By.cssSelector(btnLogin)).click();
    }


}
