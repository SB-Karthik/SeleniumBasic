package com.testingacademy.Basic.Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Exception01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        try {
            WebElement element = driver.findElement(By.id("nonexisting-element"));
            element.click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }

        System.out.println("My other code");

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));               // cssSelector("[type=\"checkbox\"]")

        for (WebElement e : checkBoxes) {
            if (!e.isSelected()) {
                e.click();
            }
        }

        // Switch to a frame which does not exist
        try {
            driver.switchTo().frame(1);
        }catch (NoSuchFrameException e){
            System.out.println("Frame not found...!!");
        }
    }
}
