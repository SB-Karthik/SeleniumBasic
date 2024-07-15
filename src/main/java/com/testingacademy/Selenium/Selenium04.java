package com.testingacademy.Basic.Selenium;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class Selenium04 {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://app.vwo.com/#/login");

        driver.navigate().to("https://app.vwo.com/#/login");
        driver.navigate().to(new URL("https://www.amazon.in"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
