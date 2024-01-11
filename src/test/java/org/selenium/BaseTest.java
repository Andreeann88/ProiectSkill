package org.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public static void setupAllTests() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

    }

    @BeforeEach //deschide instanta noua dupa fiecare test
    public  void setupEachTest() {
       driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown() {
       // driver.close();
    }

    @Test
    public void smokeTest () {
        System.out.println("Hello Test");

    }


}
