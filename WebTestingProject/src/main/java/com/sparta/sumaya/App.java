package com.sparta.sumaya;

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
        WebDriver webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        webdriver.get("https:\\localhost:9292");
    }
}
