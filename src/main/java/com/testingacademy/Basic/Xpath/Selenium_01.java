package com.testingacademy.Basic.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.List;

public class Selenium_01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//
//        WebElement headerText = driver.findElement(By.xpath("//h1"));
//        System.out.println(headerText.getText());

        driver.get("https://awesomeqa.com/css/");
        List<WebElement> listofSpan = driver.findElements(By.cssSelector("div.first > span"));
        System.out.println(listofSpan.get(2).getText());
    }
}
