package com.adidas.base;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver = Driver.get();
    public WebDriverWait wait;


    public BasePage(){
        PageFactory.initElements(driver,this);
    }

@FindBy(partialLinkText = "Home")
public WebElement home;

@FindBy(linkText = "Cart")
public WebElement cart;



}
