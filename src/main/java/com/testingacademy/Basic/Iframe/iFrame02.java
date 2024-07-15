package com.testingacademy.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class iFrame02 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://codepen.io./mmoonn/full/PwvraE");

        driver.switchTo().frame("result");

        Actions actions = new Actions(driver);
        WebElement e = driver.findElement(By.className("box"));            // By.cssSelector("body > div")
        actions.moveToElement(e).perform();

//        driver.switchTo().defaultContent();    // parent iframe

    }
}
