package com.Polymer.pagesPolymer;

import com.Polymer.basePolymer.BasePagePolymer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolymerPage extends BasePagePolymer {

    @FindBy(id = "new-todo")
    public WebElement createItemBox;


}
