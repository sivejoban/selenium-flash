package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.UUID;

public class Actions extends Elements {

    private WebDriver driver;

    // Constructor
    public Actions(WebDriver driver) {
        this.driver = driver;
    }

    public static String generateRandomEmail() {
        String uniqueID = UUID.randomUUID().toString(); // Generates a unique ID
        return "user" + uniqueID + "@example.com"; // Creates a random email
    }

    // Register User

    public void registerUser() {
        driver.findElement(Elements.Register_Button).click();
    }

    public void genderButton() {
        driver.findElement(Elements.Gender_Radiobutton).click();
    }

    public void enterFirstname(String firstname) {
        driver.findElement(Elements.FirstName).sendKeys(firstname);
    }

    public void enterLastname(String lastname) {
        driver.findElement(Elements.LastName).sendKeys(lastname);
    }

    public void enterEmail(String email) {
        driver.findElement(Elements.Email).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(Elements.Password_Field).sendKeys(password);
    }

    public void confirmPassword(String confirm_password) {
        driver.findElement(Elements.Confirm_password).sendKeys(confirm_password);
    }

    public void secondResister() {
        driver.findElement(Elements.Second_Register).click();
    }

    public void logoutMenu() {
        driver.findElement(Elements.Logout_Button).click();
    }


    //Login User

    public void loginMenu() {
        driver.findElement(Elements.Login_Button).click();
    }

    public void login_User(String login) {
        driver.findElement(Elements.Username_Text).sendKeys(login);
    }

    public void user_Pass(String pass) {
        driver.findElement(Elements.Password_Text).sendKeys(pass);
    }

    public void login_Inside() {
        driver.findElement(Elements.Login_inside).click();
    }

    public void computers_tab() {
        driver.findElement(Elements.Computers_Tab).click();
    }

    public void desktops() {
        driver.findElement(Elements.Desktops).click();
    }

    public void dropdown() {
        driver.findElement(Elements.Order_By).click();
    }

    public void AllOptions() {
        driver.findElement(Elements.Position).click();
        driver.findElement(Elements.AtoZ).click();
        driver.findElement(Elements.ZtoA).click();
        driver.findElement(Elements.HighToLow).click();
        driver.findElement(Elements.LowToHigh).click();
        driver.findElement(Elements.CreatedOn).click();

    }
public void simpleComputer(){
    driver.findElement(Elements.SimpleComputer).click();
    driver.findElement(Elements.Processor).click();
    driver.findElement(Elements.AddSimpleComputer).click();
    driver.findElement(Elements.DesktopsAgain).click();

}

public void buildYourOwn(){
    driver.findElement(Elements.BuildOwnComputer).click();
    driver.findElement(Elements.HDD).click();
    driver.findElement(Elements.AddOwnCom).click();
    driver.findElement(Elements.DesktopsAgain2).click();

}


public void buildOwnCheap(){
    driver.findElement(Elements.BuildOwnCheap).click();
    driver.findElement(Elements.AddOwnCheap).click();
    driver.findElement(Elements.DesktopsAgain2).click();
}

public void buildOwnExpensive(){
    driver.findElement(Elements.BuildOwnExpensive).click();
    driver.findElement(Elements.AddOwnExpensive).click();
    driver.findElement(Elements.DesktopsAgain2).click();
    driver.findElement(Elements.Cart).click();
    driver.findElement(Elements.terms).click();

}


public void checkout(){
    driver.findElement(Elements.checkout).click();
    driver.findElement(Elements.continueButton).click();
    driver.findElement(Elements.continueButton2).click();
}






    }













