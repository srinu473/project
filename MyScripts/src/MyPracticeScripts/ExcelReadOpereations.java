package MyPracticeScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadOpereations
{
	@Test
	public void exceloperations() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\sample.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		while (row.hasNext()) 
		{
			Row r=row.next();
			Iterator<Cell> cell=r.iterator();
			while (cell.hasNext()) 
			{
				Cell c = cell.next();
				if (c.getCellType()==c.CELL_TYPE_STRING) 
				{
				   System.out.print(c.getStringCellValue()+"    ");	
				}
				else if (c.getCellType()==c.CELL_TYPE_NUMERIC)
				{
					System.out.print(c.getNumericCellValue()+"    ");	
				}
				
				
			}
			System.out.println();
			
			
			
		}
		
		
		
		
		
		
	}
	

}
