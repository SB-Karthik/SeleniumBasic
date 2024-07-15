package com.testingacademy.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Complex_scenorio {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/analyze/osa/13/heatmaps/1?token=eyJhY2\n" +
                "NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMj\n" +
                "A1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MD\n" +
                "M1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOn\n" +
                "ly=1");

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println(mainWindowHandle);

        List<WebElement> webElementList = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));

        new Actions(driver).moveToElement(webElementList.get(1)).click().perform();

        // switch o the child
        // move to the Iframe of child
        // click on the clikmap

        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterable = windowHandles.iterator();
        while (iterable.hasNext()){
            String childWindow = iterable.next();
                if(!mainWindowHandle.equals(childWindow)){
                    driver.switchTo().window(childWindow);
                    driver.switchTo().frame("heatmap-iframe");
                    driver.findElement(By.cssSelector("[data-qa=\"liqokuxuba\"]")).click();
                }
        }


    }
}
