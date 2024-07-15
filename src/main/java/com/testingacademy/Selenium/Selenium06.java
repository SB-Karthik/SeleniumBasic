package com.testingacademy.Basic.Selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Selenium06 {
        // 2 test cases
        // 1 positive  -> Valid user -> Dashboard
        // 1 negative  -> Invalid User -> Error
    ChromeOptions options;
    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority = 1, groups = {"negative","sanity"})
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC#1 -> Verify the Invalid username and valid password, Login is not successfull..!")
    public void testInvalidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();

//        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.className("notification-box-description"));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(errorMessage));

//        Wait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//
//        WebElement errorMessage2 = wait.until(new Function<WebDriver, WebElement>() {
//            @Override
//            public WebElement apply(WebDriver webDriver) {
//                return driver.findElement(By.className("notification-box-description"));
//            }
//        });

        String errorString = driver.findElement(By.className("notification-box-description")).getText();
        Assert.assertEquals(errorString,"Your email, password, IP address or location did not match");
    }

    @Test(enabled = false, priority = 2, groups = {"positive","sanity"})
    @Description("TC#2 -> Verify the valid username and valid password, Login is  successfull..!")
    public void testValidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");
        driver.findElement(By.id("login-username")).clear();
        driver.findElement(By.id("login-username")).sendKeys("nihim56864@mposhop.com");
        driver.findElement(By.id("login-password")).sendKeys("Wingify@123");
        driver.findElement(By.id("js-login-btn")).click();

//        Thread.sleep(2000);

        Assert.assertEquals(driver.getTitle(),"Login - VWO");
       // Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
    }

    @AfterSuite
    public void tearDown(){

    }
}
