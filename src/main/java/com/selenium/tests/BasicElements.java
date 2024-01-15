package com.selenium.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BasicElements
{
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");



        //using file type
        TakesScreenshot ts = ((TakesScreenshot) driver);
        File scrFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("C:\\Users\\Anuraag\\IdeaProjects\\CompleteSelenium\\screenshots/image1.jpg"); // or ./screenshots/image1.jpg
        FileUtils.copyFile(scrFile,destFile);
        // using bytearray type
        byte[] byteArr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        File arrFile = new File("C:\\Users\\Anuraag\\IdeaProjects\\CompleteSelenium\\screenshots/arrImage.jpg");
        FileOutputStream fos = new FileOutputStream(arrFile);
        fos.write(byteArr);
        driver.quit();


    }
}
