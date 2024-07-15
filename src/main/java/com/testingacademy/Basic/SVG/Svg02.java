package com.testingacademy.Basic.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Svg01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']"))
                 .sendKeys("AC");
        WebElement searchElement = driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchElement).click().perform();
//        searchElement.click();


    }
}
