package com.testingacademy.Basic.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Selenium07 {
    public static void main(String[] args) {
        ChromeOptions options;
        WebDriver driver;

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");

        List<WebElement> allInputs = driver.findElements(By.tagName("a"));
        System.out.println(allInputs);

        for (WebElement e : allInputs){
            System.out.println(e.getText());
            if(e.getText().equalsIgnoreCase("Read more about VWO Website Insights Dashboard"))
            {
                e.click();
            }
        }


    }
}
