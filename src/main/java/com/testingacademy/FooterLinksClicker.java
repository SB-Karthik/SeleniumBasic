package com.testingacademy;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

//public class FooterLinksClicker {
//
//    public static void main(String[] args) {
//        // Initialize ChromeOptions for mobile emulation
//        ChromeOptions options = new ChromeOptions();
//        Map<String, Object> deviceMetrics = Map.of(
//                "width", 430,
//                "height", 932,
//                "pixelRatio", 3.0
//        );
//        Map<String, Object> mobileEmulation = Map.of(
//                "deviceMetrics", deviceMetrics,
//                "userAgent", "Mozilla/5.0 (iPhone; CPU iPhone OS 16_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.0 Mobile/15E148 Safari/604.1"
//        );
//        options.setExperimentalOption("mobileEmulation", mobileEmulation);
//        options.addArguments("--start-maximized");
//        WebDriver driver = new ChromeDriver(options);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String baseUrl = "https://stage-consumer-web-ae.qac24svc.dev/";
//
//        try {
//            driver.get(baseUrl);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[@class='_3wtie']")));
//            List<WebElement> footerSections = driver.findElements(By.className("_3Chhr"));
//            for (WebElement section : footerSections) {
//                List<WebElement> links = section.findElements(By.tagName("a"));
//
//                for (WebElement link : links) {
//                    String linkText = link.getText();
//                    String linkUrl = link.getAttribute("href");
//
//                    js.executeScript("arguments[0].click();", link);
//                    if (linkUrl != null && !linkUrl.isEmpty()) {
//                        wait.until(ExpectedConditions.urlContains(linkUrl));
//                        System.out.println("Clicked on link: " + linkText + " (" + linkUrl + ")");
//                    } else {
//                        System.out.println("Unable to get URL for link: " + linkText);
//                    }
//
//                    driver.navigate().back();
//                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[@class='_3wtie']")));
//                    footerSections = driver.findElements(By.className("_3Chhr"));
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            driver.quit();
//        }
//    }
//}

















