package selenium;

import org.automationtesting.excelreport.Xl;

public class Excel_Report {
	
	public static void main(String[] args) throws Throwable {
		
		//Xl.generateReport("excelreport.xlsx");
		
		Xl.generateReport("E:\\Excel-Report", "Excel-Report.xlsx");
	}

}
