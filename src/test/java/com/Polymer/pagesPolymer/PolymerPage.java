package com.Polymer.pagesPolymer;

import com.Polymer.basePolymer.BasePagePolymer;
import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePagePolymer {

    @FindBy(id = "new-todo")
    public WebElement createItemBox;

    @FindBy(xpath = "//h3[.='Polymer']")
    public WebElement pageName;

    @FindBy(id = "edit")
    public WebElement editBox;

    public WebElement createdItem(String str){
        return Driver.get().findElement(By.xpath("//label[.='"+str+"']"));
    }
}
