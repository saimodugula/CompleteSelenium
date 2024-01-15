package com.selenium.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ImportData {
    public static void main(String[] args) throws Exception {
        File data = new File("C:\\Users\\Anuraag\\Desktop\\Selenium\\data.xlsx");
        FileInputStream iStream = new FileInputStream(data);
        XSSFWorkbook nBook = new XSSFWorkbook(iStream);
        XSSFSheet iSheet = nBook.getSheetAt(0);
        XSSFRow row1 = iSheet.getRow(1);
        XSSFCell cell1 = row1.getCell(1);
        String pass = cell1.getStringCellValue();
        System.out.println(pass);


    }
}
