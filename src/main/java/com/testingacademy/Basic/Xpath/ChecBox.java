package com.testingacademy.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.List;

public class ChecBox {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));               // cssSelector("[type=\"checkbox\"]")

        for (WebElement e : checkBoxes){
            if (!e.isSelected()){
                e.click();
            }
        }
    }
}
