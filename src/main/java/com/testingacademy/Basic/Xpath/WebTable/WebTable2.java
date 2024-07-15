package com.testingacademy.Basic.Xpath.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URl = "https://awesomeqa.com/webtable1.html";
        driver.get(URl);
        driver.manage().window().maximize();

        // css -> table[summary$="Sample Table"]

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));
        System.out.println(rows_table.size());

        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> col = rows_table.get(i).findElements(By.tagName("td"));
            for (WebElement element : col){
//                if (element.getText().contains("Taiwan")) {}
                    System.out.println(element.getText());
            }
        }
    }
}
