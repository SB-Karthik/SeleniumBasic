package com.testingacademy.Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;

public class Alert_01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebElement element = driver.findElement(By.cssSelector("button[onclick=\"jsAlert()\"]"));           // Xpath -> //button[@onclick="jsAlert()"]
//        element.click();

//        WebElement elementConfirm = driver.findElement(By.cssSelector("button[onclick=\"jsConfirm()\"]"));    // Xpath -> //button[@onclick="jsConfirm()"]
//        elementConfirm.click();

        WebElement elementPrompt = driver.findElement(By.cssSelector("button[onclick=\"jsPrompt()\"]"));    // Xpath -> //button[@onclick="jsPrompt()"]
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
//        String text = alert.getText();                        // comment this for Prompt
        alert.sendKeys("Pramod");

        alert.accept();              // alert.dismiss();
//        System.out.println(text);

        String result = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(result,"You successfully clicked an alert");
          Assert.assertEquals(result,"You entered: Pramod");

    }
}
