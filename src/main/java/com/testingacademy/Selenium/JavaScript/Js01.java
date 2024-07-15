package com.testingacademy.Selenium.JavaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class Js01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement button = driver.findElement(By.cssSelector("[onclick=\"addElement()\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",button);

        driver.get("https://www.cars24.ae/");
//        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        WebElement scroll = driver.findElement(By.xpath("//span[@class='_3RAY9']"));
        js.executeScript("arguments[0].scrollIntoView(true)",scroll);

    }
}
