package com.testingacademy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ClickCarBrands {

//    public static void main(String[] args) {
//
//        ChromeOptions options = new ChromeOptions();
//        WebDriver driver = new ChromeDriver(options);
//
//        try {
//            String originalUrl = "https://stage-consumer-web-ae.qac24svc.dev/";
//            driver.get(originalUrl);
//            List<WebElement> carBrandLinks = driver.findElements(By.cssSelector(".slick-slide.slick-active a.fQXDH.BC50V"));
//
//              for (int i = 0; i < carBrandLinks.size(); i++) {
//                carBrandLinks = driver.findElements(By.cssSelector(".slick-slide.slick-active a.fQXDH.BC50V"));
//                WebElement link = carBrandLinks.get(i);
//
//                String href = link.getAttribute("href");
//                link.click();
//                new WebDriverWait(driver, Duration.ofSeconds(10))
//                        .until(ExpectedConditions.urlContains(href));
//                if (i == 2) {
//                    break;
//                }
//                driver.navigate().back();
//                new WebDriverWait(driver, Duration.ofSeconds(10))
//                        .until(ExpectedConditions.urlToBe(originalUrl));
//                Thread.sleep(2000);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }

}




