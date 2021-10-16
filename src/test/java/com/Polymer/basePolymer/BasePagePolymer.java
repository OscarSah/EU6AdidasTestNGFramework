package com.Polymer.basePolymer;

import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePagePolymer {


    public BasePagePolymer() {
        PageFactory.initElements(Driver.get(), this);
    }

 public WebElement getElementTab(String str){

        String tab ="//div[.='"+str+"']";
        return Driver.get().findElement(By.xpath(tab));
 }

}