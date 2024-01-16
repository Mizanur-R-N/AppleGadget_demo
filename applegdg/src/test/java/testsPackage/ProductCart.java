package testsPackage;

import PagesPackage.*;
import utilitiesPackage.CommonMethods;
import driverPackage.Initialization;
import org.testng.annotations.Test;

public class ProductCart extends Initialization{
    CommonMethods objcommonmethod;
    LandingPage objlanding;
    SearchPage objsearch;
    productDetailsPage objproduct;
    cartPage objcart;

    @Test(priority = 0)
    void OpenWebsite() throws InterruptedException {
        String Testsite = "https://www.applegadgetsbd.com/";
        driver.get(Testsite);
        objcommonmethod= new CommonMethods(driver);
        System.out.println(driver.getCurrentUrl());
        System.out.println(objcommonmethod.getTitle());
        Thread.sleep(5000);
    }
    @Test(priority = 1)
    void SearchProduct() throws InterruptedException {
        objlanding = new LandingPage(driver);
        objlanding.logoClk();
        objlanding.setSearchitem("iphone 14");
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void toProductDetails() throws InterruptedException {
        objsearch = new SearchPage(driver);
        objsearch.itemClicking();
        Thread.sleep(5000);
    }
    @Test(priority = 3)
    void AddingProductToCart() throws InterruptedException {
        objproduct = new productDetailsPage(driver);
        objproduct.cartbtnClicking();
        objlanding.cartClk();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    void IncreaseProduct() throws InterruptedException {
        objcart = new cartPage(driver);
        objcart.IncreaseBtnClk();
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    void DecreaseProduct() throws InterruptedException {
        objcart.DecreaseBtnClk();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    void deleteProduct() throws InterruptedException {
        objcart.DeleteBtnClk();
        Thread.sleep(3000);
    }



}
