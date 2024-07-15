package com.testingacademy.Basic.ShadowDom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
//        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement inputBox = (WebElement) js.executeScript("return document.querySelector(\"div.jackPart\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\");");
        System.out.println(inputBox.getText());
        inputBox.sendKeys("Farmhouse");


    }
}
