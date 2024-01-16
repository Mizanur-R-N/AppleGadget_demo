package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productDetailsPage {

    WebDriver driver;
    By addtocartBtn = By.xpath("/html/body/div/div[3]/section[1]/div[2]/div[2]/div/div[10]/div/button[2]");

    public productDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    public void cartbtnClicking(){
        driver.findElement(addtocartBtn).click();
    }
}
