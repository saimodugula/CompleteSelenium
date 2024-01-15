package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class PageLoad {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

        Instant startTime = Instant.now();
        System.out.println(startTime.toString());
        driver.get("https://www.facebook.com");
        Instant endTime = Instant.now();
        System.out.println(endTime.toString());
        Duration duration = Duration.between(startTime,endTime);
        System.out.println("pageload time "+duration.toMillis()+"milli seconds");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
