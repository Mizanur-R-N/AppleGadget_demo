package PagesPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SearchPage {
    WebDriver driver;

    By firstItem = By.xpath("/html/body/div/section/div[2]/div[2]/div[2]/article[1]/a/figure/img");
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public void itemClicking(){
        driver.findElement(firstItem).click();
    }

}
