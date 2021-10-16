package com.Polymer.testsPolymer;

import com.Polymer.basePolymer.BasePagePolymer;
import com.Polymer.basePolymer.TestBasePolymer;
import com.Polymer.pagesPolymer.JavaScriptPage;
import com.Polymer.pagesPolymer.PolymerPage;
import com.adidas.base.BasePage;
import com.adidas.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
    PolymerPage polymerPage = new PolymerPage();
    @Test
    public void test(){
        extentLogger = report.createTest("Polymer Test Started");

        // The first step should be to load the website: DONE with TestBasePolymer
        extentLogger.info("Navigate to Main Page of the application");


        // click within the JavaScript tab
        javaScriptPage.getElementTab("JavaScript").click();
        extentLogger.info("click within the JavaScript tab");


        // select the Polymer link
        javaScriptPage.getLink("Polymer").click();
        extentLogger.info("select the Polymer link");
        Assert.assertTrue(polymerPage.pageName.isDisplayed());
        Assert.assertTrue(driver.getTitle().contains("Polymer"));
        extentLogger.info("Verify that I am on the Polymer page");

        String todo1 = "Happy Testing with EU6";
        polymerPage.createItemBox.sendKeys(todo1+ Keys.ENTER);

        String todo2 = "Second item for Happy Testing";
        polymerPage.createItemBox.sendKeys(todo2+Keys.ENTER);

        extentLogger.info("Added Two Items");
        Assert.assertTrue(polymerPage.createdItem(todo2).isDisplayed());

        // I create Actions object to handle double clicking and putting new text
        Actions actions = new Actions(driver);

        WebElement btnForChanging=polymerPage.createdItem(todo2);
        actions.doubleClick(btnForChanging).perform();

        for (int i = 0; i < todo2.length() ; i++) {
            polymerPage.editBox.sendKeys(Keys.BACK_SPACE);
        }

        polymerPage.editBox.sendKeys("I got it Friends!"+Keys.ENTER);

        Assert.assertTrue(polymerPage.createdItem("I got it Friends!").isDisplayed());

        extentLogger.pass("I changed the second item");

    }
}
