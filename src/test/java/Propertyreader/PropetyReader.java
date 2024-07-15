package com.testingacademy.Propertyreader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropetyReader {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        String fileName = System.getProperty("user.dir")+"";
         properties.load(new FileInputStream(fileName));

         String url= properties.getProperty("url");
        System.out.println(url);
    }
}
