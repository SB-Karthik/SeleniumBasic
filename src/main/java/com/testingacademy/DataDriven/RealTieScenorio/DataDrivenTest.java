package com.testingacademy.DataDriven.RealTieScenorio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class DDT_01 {

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    WebDriver driver;

    @Test(dataProvider ="loginData")
    public void testDataDriven(String email, String password, String expectedresult) {
        driver.get("https://app.vwo.com");
        WebElement emailElement = driver.findElement(By.id("login-username"));
        emailElement.clear();
        emailElement.sendKeys(email);
        WebElement passwordElement = driver.findElement(By.id("login-password"));
        passwordElement.clear();
        passwordElement.sendKeys(password);
        driver.findElement(By.id("js-login-btn")).click();

        if (expectedresult.equalsIgnoreCase("Valid")){
            String text = driver.findElement(By.cssSelector("[data-qa=\"lufexuloga\"]")).getText();
            System.out.println(text);
            Assert.assertEquals(text,"Temp Test");
        }
        if (expectedresult.equalsIgnoreCase("InValid")){
            WebElement error_message = driver.findElement(By.id("js-notification-box-msg"));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOf(error_message));
            Assert.assertTrue(error_message.isDisplayed());
            Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
        }
    }

//    @DataProvider(name = "loginData")
//    public Object[][] testData(){
//        return new Object[][]{
//                {"93npu2yyb0@esiix.com", "Wingify@123", "InValid"},
//                { "nihim56864@mposhop.com", "Wingify@123", "Valid"}
//        };
//    }

    @DataProvider(name = "loginData")
    public String[][] testDataExcel() throws IOException {
         String tesDataFile = "src/main/resources/TestData.xlsx";
         ExcelReader excelReader = new ExcelReader(tesDataFile);
         String[][] data = excelReader.getDataFromSheet(tesDataFile,"LoginData");
         return data;
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
