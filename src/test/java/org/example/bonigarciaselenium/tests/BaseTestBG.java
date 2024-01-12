package org.example.bonigarciaselenium.tests;

import org.example.bonigarciaselenium.setup.BrowserType;
import org.example.bonigarciaselenium.setup.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.bonigarciaselenium.setup.WebDriverFactory.createWebDriver;

public class BaseTestBG {
    public static WebDriver driver;
    String siteURL = "https://www.demoblaze.com/index.html";
    static BrowserType browserType;
    WebDriverWait wait;
    int timeOutPeriod = 10;


    @BeforeAll
    public static void setupBrowser(){
        browserType = BrowserType.CHROME;
    }
    @BeforeEach
    public  void setupTest (){
        driver = createWebDriver(browserType);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutPeriod));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOutPeriod));
        driver.get(siteURL);
    }

    @AfterEach
    public void tearDown(){
       // driver.quit();
    }
}
