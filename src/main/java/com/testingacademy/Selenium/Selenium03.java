package com.testingacademy.Selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class Selenium03 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);

        options.addArguments("--start-maximized");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");

       // driver.close();
        // Close the current window/Tab
        // Session Id -> != null
        // Error - Invalid session

      //  driver.quit();
        // close all the window
        // Session = null
        // session ID is null

        System.out.println(driver.getTitle());
    }
}
