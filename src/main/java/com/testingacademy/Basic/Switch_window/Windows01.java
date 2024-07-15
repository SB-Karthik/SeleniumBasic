package com.testingacademy.Basic.Switch_window;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class Windows01 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://the-internet.herokuapp.com/windows");

        // Store the handle of the  current window
        String mainWindowHandle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();

        // 2 window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles){
            // switch the focus to each window in turn
            driver.switchTo().window(handle);
        }
        driver.switchTo().window(mainWindowHandle);

    }
}
