package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	//static HSSFWorkbook workbook;
	//static HSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName) {
		
		try {
			
			//for xls ecxel file
			//FileInputStream file=new FileInputStream(excelPath);
			//workbook=new HSSFWorkbook(POIFSFileSystem(file));
		
		 workbook=new XSSFWorkbook(excelPath);
		
		
		 sheet=workbook.getSheet(sheetName);
		
		
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
	/*
	public void main (String[] args) {
		getRowCount();
		getCellData();
	}*/
	
	public static void getCellData(int rowNum,int colNum) {
		
		/*String proDir=System.getProperty("user.dir");
			System.out.println(proDir);
			String excelPath=proDir+"/data/TestData.xlsx";*/
			
			
			//or
			
			
		/*String excelPath="./data/TestData.xlsx";
		//this is partial path for excel file
		
		XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
			
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");*/
			
			//String value=sheet.getRow(1).getCell(0).getStringCellValue();
			//or
			//double value=sheet.getRow(1).getCell(0).getNumericCellValue();
			
			
			//it will format any value either string or number in cell
			
					DataFormatter formatter=new DataFormatter();
					Object value= formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
					System.out.println(value);	
		}

public static void getRowCount() {
		
	//	try {
		
			
			/*String proDir=System.getProperty("user.dir");
			System.out.println(proDir);
			String excelPath=proDir+"/data/TestData.xlsx";*/
			
			//or
				
		/*String excelPath="./data/TestData.xlsx";
		//this is partial path for excel file
		
			XSSFWorkbook workbook=new XSSFWorkbook(excelPath);
			
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");*/
			
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows:"+rowCount);
			
		/*	
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}*/
	}

}
