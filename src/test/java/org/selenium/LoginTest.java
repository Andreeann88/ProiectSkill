package org.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void loginPositive() throws InterruptedException {
       WebElement loginButton = driver.findElement(By.cssSelector(("a#login2")));
         loginButton.click();


        WebElement username = driver.findElement(By.cssSelector("input#loginusername"));
        username.sendKeys("skillbrainuser");

        WebElement password = driver.findElement(By.cssSelector("input#loginpassword"));
        password.sendKeys("123456");

        WebElement loginSubmit = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        loginSubmit.click();

      //  Thread.sleep(1500);
        WebElement webElement = driver.findElement(By.cssSelector("a#nameofuser"));
        String welcomeText = webElement.getText();


        Assertions.assertTrue(welcomeText.contains("Welcome"));
    }
}
