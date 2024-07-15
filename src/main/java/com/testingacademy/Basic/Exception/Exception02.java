package com.testingacademy.Basic.Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exception02 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("login-username"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].parentNode.removeChild(arguments[0]);",element);
        element.click();
    }
}
