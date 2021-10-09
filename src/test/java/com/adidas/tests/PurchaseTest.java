package com.adidas.tests;

import com.adidas.base.BasePage;
import com.adidas.base.TestBase;
import com.adidas.pages.CartPage;
import com.adidas.pages.ProductsPage;
import org.testng.annotations.Test;

public class PurchaseTest extends TestBase {

    ProductsPage productPage = new ProductsPage(); //
    BasePage cartPage = new CartPage(); // polymorfik way


    int expectedPurchaseAmount =0;
    @Test
    public void Test1(){

   //     System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

   //     productPage.cart.click();

   //     System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        String[][] purchaseInfo = new String[][]{{"Laptops","Sony vaio i5"},{"Laptops","Dell i7 8gb"},
                {"Monitors","Apple monitor 24"},{"Phones","Nexus 6"}};
        for(String[] strings : purchaseInfo){
            expectedPurchaseAmount+=productPage.productAdder(strings[0],strings[1]);
        }

        String[] unwantedProductsInfo = {"Dell i7 8gb","Apple monitor 24"};
        for (String s : unwantedProductsInfo) {
            expectedPurchaseAmount-= ((CartPage)cartPage).productRemover(s); // I had to cast because created in poly way
        }

        System.out.println("expectedPurchaseAmount = " + expectedPurchaseAmount);

    }

}
