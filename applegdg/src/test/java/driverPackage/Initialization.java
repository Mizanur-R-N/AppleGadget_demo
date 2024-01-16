package driverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Initialization {
    public WebDriver driver;

    @BeforeTest
    public void launchBrowser() {

//        String chromedriverlocation = "G:/New Selenium/chromedriver/chromedriver.exe";
        String firefoxdriverlocation = "G:/New Selenium/geckodriver/geckodriver.exe";
        System.setProperty("webdriver.chrome.driver", firefoxdriverlocation);
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
