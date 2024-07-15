package com.testingacademy.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class Katalon_demo2 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[@href=\"./profile.php#login\"]")).click();

        wait.until(ExpectedConditions.urlContains("profile.php#login"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
        driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

        wait.until(ExpectedConditions.urlContains("appointment"));
        WebElement element = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Select select = new Select(element);
        select.selectByVisibleText("Hongkong CURA Healthcare Center");

        driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();
        driver.findElement(By.xpath("//input[@id='radio_program_medicaid']")).click();

        driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("10/07/2024");
        driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("Book this app");
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

        wait.until(ExpectedConditions.urlContains("appointment.php#summary"));
        WebElement h1 = driver.findElement(By.xpath("//h2[normalize-space()='Appointment Confirmation']"));
        Assert.assertEquals(h1.getText(),"Appointment Confirmation");
        driver.quit();

    }
}
