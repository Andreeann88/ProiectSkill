package org.example.bonigarciaselenium.pageobjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
   private WebDriver driver;
    private WebElement loginButton;
    public BasePage (WebDriver driver) {
        this.driver = driver;


         loginButton = driver.findElement(By.cssSelector(("a#login2")));



    }

}
