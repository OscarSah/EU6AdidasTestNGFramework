package com.adidas.pages;

import com.adidas.base.BasePage;
import com.adidas.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class CartPage extends BasePage {


    @FindBy(xpath = "//button[.='Place Order']")
    public WebElement placeButton;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "card")
    public WebElement card;

    @FindBy(id = "month")
    public WebElement month;

    @FindBy(id = "year")
    public WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement confirmation;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement OK;



    public int productRemover(String product, WebDriverWait wait){

        cart.click();
        String productPath = "//td[.='"+product+"']"; //string concatination to get dynamically locator
        String productPricePath = productPath+"/../td[3]";
        String deletePath = productPath+"/../td[4]/a";

        // get the price of deleted product
        String priceText = Driver.get().findElement(By.xpath(productPricePath)).getText();

        // delete the product
        Driver.get().findElement(By.xpath(deletePath)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(productPath)));
        return Integer.parseInt(priceText);

    }


    public void fillForm() {
        Faker faker = new Faker();

        name.sendKeys(faker.name().fullName());
        country.sendKeys(faker.country().name());
        city.sendKeys(faker.country().capital());
        card.sendKeys(faker.finance().creditCard());
        month.sendKeys(String.valueOf(faker.number().numberBetween(1,12)));
        year.sendKeys(String.valueOf(faker.number().numberBetween(2022,2030)));

    }


}
