package com.generic.library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	
	
	String filepath="./src/test/resources/commondata.properties";
	String excelpath="./src/test/resources/TestData.xlsx";
	
	public Properties getPropertyFileObject() throws Throwable
	{
		FileInputStream fis=new FileInputStream(filepath);
		
		Properties pobj=new Properties();
		
		pobj.load(fis);
		
		return pobj;
					
	}
	
	public String getExcelData(String SheetName,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(SheetName);
		String data=sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		wb.close();
		return data;
		
	}
	
	public void setExcelData(String sheetName,int rowNum,int cellNum,String cellValue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
	    sh.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
	    FileOutputStream fos=new FileOutputStream(excelpath);
	    
	    wb.write(fos);
	    wb.close();
	}
	
	public ArrayList<String> getExcelAllData(String SheetName,int cellNum) throws Throwable
	{
		ArrayList<String> data=new ArrayList<String>();
		FileInputStream fis=new FileInputStream(excelpath);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet(SheetName);
		
		//get the used rowcount
		
		    int rowCount=sh.getLastRowNum();
		    
		    for (int i = 0; i <=rowCount; i++) {
		    	
		    	data.add(sh.getRow(i).getCell(cellNum).getStringCellValue());
		    	
		    	
				
			}
		    
		    return data;
		
		
	}
	
	
	
	

}
