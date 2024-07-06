package com.testingacademy.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;

public class OrangeHRM {
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
        button.click();
//        driver.quit();
    }
}

//public class OrangeHRM {
//    public static void main(String[] args) throws InterruptedException {
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.addArguments("--start-maximized");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");
//        Thread.sleep(3000);
//
//        WebElement sername = driver.findElement(By.name("username"));
//        sername.sendKeys("admin");
//
//        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
//        password.sendKeys("Hacker@4321");
//
//        WebElement button = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
//        button.click();
//    }
//}