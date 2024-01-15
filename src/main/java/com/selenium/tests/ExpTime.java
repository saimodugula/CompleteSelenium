package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExpTime {
    public static void main(String[] args) throws Exception{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.github.com/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }
}
