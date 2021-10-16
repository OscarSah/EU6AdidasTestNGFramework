package com.Polymer.testsPolymer;

import com.Polymer.basePolymer.BasePagePolymer;
import com.Polymer.basePolymer.TestBasePolymer;
import com.Polymer.pagesPolymer.JavaScriptPage;
import com.adidas.base.BasePage;
import org.testng.annotations.Test;

public class PolymerTest extends TestBasePolymer {

    /*
Write a basic browser automation framework to validate a Polymer website.
The focus should be on the interaction with the browser.
The Web Application under test http://todomvc.com/
The first step should be to load the website, click within the JavaScript tab,
and select the Polymer link.
The second step should be: Add two Todo items
Bonus: (optional stretch goal): Edit the content of the second Todo item
     */


    JavaScriptPage javaScriptPage = new JavaScriptPage();
    @Test
    public void test(){

        // The first step should be to load the website: DONE with TestBasePolymer

        // click within the JavaScript tab
        javaScriptPage.getElementTab("JavaScript").click();



    }
}
