package com.Polymer.pagesPolymer;

import com.Polymer.basePolymer.BasePagePolymer;
import com.adidas.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class JavaScriptPage extends BasePagePolymer {


        public WebElement getLink(String str){
            String link = "//li/a[.='"+str+"']";
            return Driver.get().findElement(By.xpath(link));
        }
}
