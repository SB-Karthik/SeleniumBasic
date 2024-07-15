package com.testingacademy.Basic.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.Collections;

public class Selenium02 {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.in");

        //  options.setPageLoadStrategy();      3 Load -> Fast, medium load, slow load
        //  options.setHeadless();   -> Headless - without UI (while running the selenium automation, you will not see UI)
        // Headless -> use it when ur test case done

        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");

        //    /Users/user/Downloads/Adblocker.crx      // -> we can add extensions
//        options.addExtensions(new File("/Users/user/Downloads/Adblocker.crx"));

//        // Disable extensions
//        options.addArguments("--disable-extensions");
//
//        // Disable notification
//        options.addArguments("--disable-notifications");
//
//        // Disable Javascript
//        options.addArguments("--disable-javascript");
//
//        // set specific language for UI
//        options.addArguments("--lang=es");

//       //  set the download directory
//        options.addArguments("--download.default_directory=/Users/user/Downloads");
//
//        // disable default password manager
//        options.addArguments("--disable-password-manager");

        // to Set the window size
//        options.addArguments("--window-size=1280,800");
        // want to maximize the window

       // options.addArguments("--user-data-dir=/Users/user/Library/Application Support/Google/Chrome/Profile 2");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
//        driver.quit();
    }
}
