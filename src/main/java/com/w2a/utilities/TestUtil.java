package com.w2a.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.page;

public class TestUtil extends page {
	public static String screenshotPath;
	public static String screenshotName;
	
	
	@DataProvider(name="dp")
	public Object[][] getData(Method m){
		  
		String sheetName= m.getName();
		int rows= excel.getRowCount(sheetName);
		int cols= excel.getColumnCount(sheetName);
		
		Object[][] data= new Object[rows-1][1];
		
		Hashtable<String,String> table =null;
		
		for(int rowNum = 2; rowNum<= rows; rowNum++) {
			 table=new Hashtable<String,String>();
			 
			
			for(int colNum=0; colNum< cols; colNum++) {
				table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
				data[rowNum-2][0] = table;
			}
			
		}
		
		return data;
		
	}
	
	
	public static boolean isTestRunnable(String Testname, ExcelReader excel) {
		  
		String sheetname="Test_Suite";
		int rows=excel.getRowCount(sheetname);
		
		for(int rowNum=2; rowNum<=rows;rowNum++) {
			
			String Testcase=excel.getCellData(sheetname,"TCID",rowNum);
			if (Testcase.equalsIgnoreCase(Testname)) {
				
				String runmode=excel.getCellData(sheetname, "Runmode", rowNum);
				if (runmode.equalsIgnoreCase("y")) 
					return true;
				else 
					return false;				
				}
				
			}
		       return false;
		}
		
		
		
	}
	
	


