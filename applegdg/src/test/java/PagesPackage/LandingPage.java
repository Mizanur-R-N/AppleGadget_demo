package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LandingPage {
    WebDriver driver;
    By searchBar = By.id("search");
    By logo = By.cssSelector(".object-contain");
    By searchBtn = By.xpath("/html/body/div/header/div[1]/nav/div[1]/div/form/button/i");
    By cart = By.cssSelector("ul.grid > li:nth-child(2) > a:nth-child(1)");

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

     public void setSearchitem(String searchitem){
        driver.findElement(searchBar).clear();
        driver.findElement(searchBar).sendKeys(searchitem);
        driver.findElement(searchBtn).click();
    }


    public void logoClk(){
        driver.findElement(logo).click();
    }

    public void cartClk(){
        driver.findElement(cart).click();
    }


}
