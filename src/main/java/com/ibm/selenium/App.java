package com.ibm.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "src\\main\\res\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
}
