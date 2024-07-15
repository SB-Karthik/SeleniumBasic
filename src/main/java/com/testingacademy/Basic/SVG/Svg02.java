package com.testingacademy.Basic.SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Svg02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("input[value='I agree']")).click();

        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
        for (WebElement e : states){
            System.out.println(e.getAttribute("aria-label"));
            if (e.getAttribute("aria-label").trim().equals("Tripura")){
                new Actions(driver).moveToElement(e).click().perform();
            }
        }
    }
}
