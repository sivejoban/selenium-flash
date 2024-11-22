package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Elements {


    //Register
    public static final By Register_Button = By.className("ico-register");
    public static final By Gender_Radiobutton = By.id("gender-female");
    public static final By FirstName = By.id("FirstName");
    public static final By LastName = By.id("LastName");
    public static final By Email = By.id("Email");
    public static final By Password_Field = By.id("Password");
    public static final By Confirm_password = By.id("ConfirmPassword");
    public static final By Second_Register = By.id("register-button");
    public static final By Logout_Button = By.className("ico-logout");



   //Login
   public static final By Login_Button = By.className("ico-login");
   public static final By Username_Text = By.name("Email");
   public static final By Password_Text = By.name("Password");
   public static final By Login_inside = By.className("button-1");
   public static final By Computers_Tab = By.linkText("Computers");
   public static final By Desktops = By.linkText("Desktops");

   //OrderBy
   public static final By Order_By = By.id("products-orderby");
   public static final By Position = By.xpath("//option[text()='Position']");
   public static final By AtoZ = By.xpath("//*[@id='products-orderby']/option[2]");
   public static final By ZtoA = By.xpath("//*[@id='products-orderby']/option[3]");
   public static final By HighToLow = By.xpath("//*[@id='products-orderby']/option[4]");
   public static final By LowToHigh = By.xpath("//*[@id='products-orderby']/option[5]");
   public static final By CreatedOn = By.xpath("//*[@id='products-orderby']/option[6]");

   //Add To Cart
   public static final By SimpleComputer = By.linkText("Simple Computer");
   public static final By Processor = By.id("product_attribute_75_5_31_96");
   public static final By AddSimpleComputer = By.id("add-to-cart-button-75");
   public static final By DesktopsAgain = By.linkText("Desktops");
   public static final By BuildOwnComputer = By.linkText("Build your own computer");
   public static final By HDD = By.id("product_attribute_16_3_6_18");
   public static final By AddOwnCom = By.id("add-to-cart-button-16");
    public static final By DesktopsAgain2 = By.linkText("Desktops");
    public static final By BuildOwnCheap = By.linkText("Build your own cheap computer");
    public static final By AddOwnCheap = By.id("add-to-cart-button-72");
    public static final By BuildOwnExpensive = By.linkText("Build your own expensive computer");
    public static final By AddOwnExpensive = By.id("add-to-cart-button-74");
    public static final By Cart = By.linkText("Shopping cart");
    public static final By terms = By.id("termsofservice");
    public static final By checkout = By.id("checkout");
























}
