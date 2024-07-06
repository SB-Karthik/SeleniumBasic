package com.testingacademy.Basic;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.Collections;
//import java.util.List;
//
//public class Selenium08 {
//    public static void main(String[] args) {
//        ChromeOptions options;
//        WebDriver driver;
//
//        options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.addArguments("--start-maximized");
//        driver = new ChromeDriver(options);
//        driver.get("https://app.vwo.com/#/login");
//    }
//}



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class Selenium08 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        username.sendKeys("admin");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        password.sendKeys("Hacker@4321");

        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));

    }
}

