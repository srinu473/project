package MyPracticeScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriteOperations 
{
	@Test
	public void Excelwrite() throws IOException
	{

		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		// Modify existing cell
		Row r=ws.getRow(1);
		Cell c=r.getCell(1);
		c.setCellValue("Pavan");
		// Creating new cell in Existing Row
		r=ws.getRow(2);
		c=r.createCell(3);
		c.setCellValue("charan");
		
		// Creating new row and cell  send data in it
		
		r=ws.createRow(8);
		c=r.createCell(0);
		c.setCellValue("newCellRow");
		
		// Save the excel file
		
		FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\sampleOP.xlsx");
		wb.write(fo);

		
		
		
	}

}
