package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {

    WebDriver driver;

    By increaseBtn = By.xpath("/html/body/div/section/div/div[1]/div[2]/table/tbody/tr/td[4]/div/button[2]");
    By decreaseBtn = By.xpath("/html/body/div/section/div/div[1]/div[2]/table/tbody/tr/td[4]/div/button[1]");
    By deleteBtn = By.cssSelector(".bi-trash");
    By checkoutBtn = By.cssSelector("button.px-4:nth-child(2)");

    public cartPage(WebDriver driver){
        this.driver = driver;
    }

    public void IncreaseBtnClk(){
        driver.findElement(increaseBtn).click();
    }
    public void DeleteBtnClk(){
        driver.findElement(deleteBtn).click();
    }
    public void DecreaseBtnClk(){
        driver.findElement(decreaseBtn).click();
    }
    public void checkoutBtnClk(){
        driver.findElement(checkoutBtn).click();
    }

}
