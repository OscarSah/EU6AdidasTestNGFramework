package com.Polymer.basePolymer;

import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(partialLinkText = "Home")
    public WebElement home;

    @FindBy(linkText = "Cart")
    public WebElement cart;


}