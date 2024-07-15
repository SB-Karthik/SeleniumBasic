package com.testingacademy.Basic.Selenium.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_upload {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/selenium/upload.html");

        WebElement upload_file = driver.findElement(By.xpath("//input[@id='fileToUpload']"));
        upload_file.sendKeys("/Users/user/Downloads/file-sample.pdf");
        driver.findElement(By.name("submit")).click();


    }
}
