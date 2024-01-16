package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;

    By onlinePayment = By.linkText("Cash on Delivery");
    WebElement paymentOption = driver.findElement(onlinePayment);

    By cod = By.linkText("Online Payment");
    WebElement cashOnOption = driver.findElement(cod);
    By userName = By.name("first_name");
    By email = By.name("email");
    By mobile = By.name("phone");
    By address = By.id("address");
    By order = By.xpath("/html/body/div/section/form/div[1]/div[3]/div[4]/div[2]/button");

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void setOrder(){
        driver.findElement(order).click();
    }

    public void setUserName(String setName){
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys(setName);
    }

    public void setEmail(String setemail){
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(setemail);
    }

    public void setMobile(String setPhone){
        driver.findElement(mobile).clear();
        driver.findElement(mobile).sendKeys(setPhone);
    }
    public void setAddress(String setAdd){
        driver.findElement(address).clear();
        driver.findElement(address).sendKeys(setAdd);
    }

    public void CashOnDeliveryOrder(){
       if (cashOnOption.isSelected()){
           System.out.println("Cash On Delivery is selected");
       }else{
           cashOnOption.click();
       }
    }

    public void OnlinePaymentOrder(){
        if (paymentOption.isSelected()){
            System.out.println("Online payment is selected");
        }else{
            paymentOption.click();
        }
    }


    public void ConfirmCODOrder(String setName, String setPhone, String Add){
        this.setUserName(setName);
        this.setMobile(setPhone);
        this.setAddress(Add);
        this.setOrder();
    }

    public void ConfirmPaymentOrder(String setName,String setEmail, String setPhone, String Add){
        this.setUserName(setName);
        this.setEmail(setEmail);
        this.setMobile(setPhone);
        this.setAddress(Add);
        this.setOrder();
    }

}
