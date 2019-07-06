package com.generic.library;

import java.io.File;

import org.automationtesting.excelreport.Xl;

public class ExcelReporter {
	
	public static void main(String[] args) throws Exception {
		
		Xl.generateReport("./excelreport/"+"report.xlsx");
		
		
	}

}
