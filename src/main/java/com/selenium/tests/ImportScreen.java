package com.selenium.tests;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ImportScreen{
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
       WebElement email = driver.findElement(By.id("email"));
        File data = new File("C:\\Users\\Anuraag\\Desktop\\Selenium\\data.xlsx");
        FileInputStream iStream = new FileInputStream(data);
        XSSFWorkbook book = new XSSFWorkbook(iStream);
        XSSFSheet mainSheet = book.getSheetAt(0);
        email.sendKeys(mainSheet.getRow(1).getCell(0).getStringCellValue());
        TakesScreenshot ts = ((TakesScreenshot) driver);
        File scrFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshots/data.jpg");
        FileUtils.copyFile(scrFile,destFile);
        driver.close();


    }
}
