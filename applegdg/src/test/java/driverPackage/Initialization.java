package driverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialization {
    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        System.out.println("Browser is ready");
        driver.manage().window().maximize();
    }


    @AfterTest
    public void quitDriver() {
//        if (driver != null)
            driver.quit();
        System.out.println("Browser is close");
    }

}
