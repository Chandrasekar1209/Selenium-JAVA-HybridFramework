package com.htc.excelRead;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelFileReadHandler {

	//XSSF //HSSF
	Workbook Workbook;
	Sheet loginData;
	public ExcelFileReadHandler(String excelfilePath) {
		try {
		File s = new File(excelfilePath);
		FileInputStream stream = new FileInputStream(s);
		Workbook = new XSSFWorkbook(stream);
		System.out.println("excelFilepath"+excelfilePath);
		System.out.println("Workbook :"+Workbook.getNumberOfSheets());
		}
		catch(Exception e) {
		System.out.println("error "+e.getMessage());
		}
		}

	
public Object[][] getDataUsingMap(String sheetName){
			
			loginData = Workbook.getSheet(sheetName);
			int rowCount = loginData.getLastRowNum();
			int colCount = loginData.getRow(0).getLastCellNum();
			
			Object[][] obj = new Object[rowCount][1];
			
			
			for(int row=0; row<rowCount; row++) {
				Map<Object, Object> dataMap = new HashMap<Object, Object>();
				for(int col=0; col<colCount; col++) {
					dataMap.put(loginData.getRow(0).getCell(col).toString(), loginData.getRow(row+1).getCell(col).toString());
				}
				obj[row][0] = dataMap;
			}
			
			
			return obj;
			
		}
}
