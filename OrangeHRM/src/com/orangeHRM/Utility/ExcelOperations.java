package com.orangeHRM.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations 
{
	public int GetRowCount(String path,int SheetNo) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(SheetNo);
		int r=ws.getLastRowNum();
		return r;
	
	}
	
	public Row GetRow(int rw,String path,int SheetNo) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(SheetNo);
		Row row=ws.getRow(rw);
		return row;
		
		
		
	}
	public String GetCellData(String path,int Sheetno,int rw,int cellNo) throws IOException
	{
		FileInputStream f=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(Sheetno);
		Row row=ws.getRow(rw);
		String celldata=row.getCell(cellNo).getStringCellValue();
		return celldata;
		
		
		
		
		
		
		
		
	}

}
