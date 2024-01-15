package com.selenium.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FaceBook {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        File filePath = new File("C:\\Users\\Anuraag\\Desktop\\Selenium\\data.xlsx");
        FileInputStream insStream = new FileInputStream(filePath);
        XSSFWorkbook workBook = new XSSFWorkbook(insStream);
        XSSFSheet innSheet = workBook.getSheet("Sheet2");// using name of excel sheets in the book
        XSSFSheet inSheet = workBook.getSheetAt(0);// using sheet index number in book
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(inSheet.getRow(1).getCell(0).getStringCellValue());
        String enteredText = email.getAttribute("value");
        System.out.println(enteredText);

        // by creating row, cell and getstringcellvalue
        WebElement password = driver.findElement(By.id("pass"));
        XSSFRow row1 = inSheet.getRow(1);
        XSSFCell cell1 = row1.getCell(1);
        String pass = cell1.getStringCellValue();
        password.sendKeys(pass);

        System.out.println(pass);


    }
}
