package com.example.selenium;


import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class TestingPagesTest {
    public static WebDriver driver;
    public static Actions Actions;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver" ,"/usr/local/bin/chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");

        Actions = new Actions(driver);
    }

     @Test
    public void testRegistration() throws InterruptedException {

         String randomEmail = Actions.generateRandomEmail();
        // Perform Actions
         Actions.registerUser();
         Actions.genderButton();
         Actions.enterFirstname("tingo");
         Actions.enterLastname("lomzi");
         Actions.enterEmail(randomEmail);
         Actions.enterPassword("amandawwe12");
         Actions.confirmPassword("amandawwe12");
         Actions.secondResister();
         Actions.logoutMenu();
         Actions.loginMenu();
         Actions.login_User("tingolomzi@size.com");
         Actions.user_Pass("amandawwe12");
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        Actions.login_Inside();
         try {
             Thread.sleep(5000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         Alert alert = driver.switchTo().alert();
         alert.accept();
         Actions.computers_tab();
         Actions.desktops();
         Thread.sleep(5000);
         Actions.dropdown();
         Thread.sleep(5000);
         Actions.AllOptions();
         Actions.simpleComputer();
         Actions.buildYourOwn();
         Actions.buildOwnCheap();
         Actions.buildOwnExpensive();
         Actions.getCartTotalPrice();


    }



//    @After
//    public void tearDown() {
//        // Clean up WebDriver after each test
//        if (driver != null) {
//            driver.quit();
//        }


}
