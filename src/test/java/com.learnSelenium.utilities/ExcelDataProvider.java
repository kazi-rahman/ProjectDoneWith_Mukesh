package com.learnSelenium.utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelDataProvider  {

    XSSFWorkbook wb;
    FileInputStream fis;

    public ExcelDataProvider() {
        try {
             fis = new FileInputStream("C:/STUDY/Zariah Documents/MukeshData.xlsx");
             wb = new XSSFWorkbook(fis);

        } catch (Exception e) {
            System.out.println("unable to read the excel file" + e.getMessage());
        }

    }


    public double intExcelData(String sheetName, int rowNum, int colNum) {
        return wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getNumericCellValue();

    }

    public String StringExcelData(int sheetIndex, int rowNum, int cellNum) {
        return wb.getSheetAt(sheetIndex).getRow(rowNum).getCell(cellNum).getStringCellValue();

    }

    public String StringExcelData(String sheetName, int rowNum, int colNum) {
        return wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).getStringCellValue();

    }

    public double intExcelData(int sheetIndex, int rowNum, int cellNum) {
        return wb.getSheetAt(sheetIndex).getRow(rowNum).getCell(cellNum).getNumericCellValue();

    }


}
