package window_handling_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_read {
	
	
	public static void main(String[] args) throws Throwable {
		int i=0;
		FileInputStream file=new FileInputStream("./java_library/TestData.xlsx");
		
		Workbook wb=WorkbookFactory.create(file);
		
		//get the control to sheet
		       
		Sheet sh=wb.getSheet("Sheet2");
		
		      while( i<18)  
		      {
				
		
		String data=sh.getRow(i).getCell(0).getStringCellValue();
		     
		System.out.println(data);
	
		i++;
		
	}
	}}

