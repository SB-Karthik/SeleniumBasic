package com.testingacademy.Basic.Xpath.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String URl = "https://awesomeqa.com/webtable.html";
        driver.get(URl);
        driver.manage().window().maximize();

        // table -> //table[@id="customers"]
        // Row ->  //table[@id="customers"]/tbody/tr         Heading(row-1)
        // column -> //table[@id="customers"]/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println(row);
        System.out.println(col);

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        for (int i = 2; i < row ; i++) {
            for (int j = 1; j < col; j++) {
                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
                if (data.contains("Helen Bennett")){
                    String country_path = dynamic_xpath+"/following-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    System.out.println("-----------");
                    System.out.println("Helen Bennett is in - "+country_text);
                }
//                System.out.print(data +" ");
            }
        }


        // find Helen Bennett In which country
    }
}
