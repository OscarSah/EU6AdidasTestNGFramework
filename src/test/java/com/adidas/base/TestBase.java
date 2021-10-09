package com.adidas.base;

import com.adidas.utilities.ConfigurationReader;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected String url;

    @BeforeMethod
    public void setUp(){


        driver = Driver.get();  // this is enough to initiliazie the driver object

        driver.manage().window().maximize();

        url = ConfigurationReader.get("url");
        actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // implicit waiting
        wait = new WebDriverWait(driver, 10); // explicit waiting object
        driver.get(url);

    }

    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();

    }

}
