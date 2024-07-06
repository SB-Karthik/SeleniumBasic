package com.testingacademy.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium05 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://app.vwo.com/#/login");
        // find the element do some
        // ID, Class, name, tag name, PartialText and LINK text

//        <input
//          type="email"
//          class="text-input W(100%)"
//          name="username"
//          id="login-username"
//          data-qa="hocewoqisi">

        // Aim to put mail id into the username input box
        // Priority for element -> id > name > ClassName > css selector > Xpath > link > partial text
        // unique
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("nihim56864@mposhop.com");    // nihim56864@mposhop.com        93npu2yyb0@esiix.com

//        <input type = "password"
//        class="text-input W(100%)"
//         name = "password"
//        id = "login-password"
//        data - qa = "jobodapuxe" >

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Wingify@123");

//        <button type="submit" id="js-login-btn" class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();
    }
}
