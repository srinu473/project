package FrameworkScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class KeywordLoginTest 
{
	@Test
	public void keywordLoginTest() throws IOException
	{
		LoginKeywords keys=new LoginKeywords();
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\KeywordData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row> row=ws.iterator();
		row.next();
		String action=null;
		while (row.hasNext())
		{
			Row r=row.next();
			String runmode=r.getCell(4).getStringCellValue();
			 action=r.getCell(3).getStringCellValue();
			if (runmode.equals("Y"))
			{
				
				if (action.equals("Launchbrowser"))
				{
					keys.Launchbrowser();
				}
				else if (action.equals("Navigateurl"))
				{
					keys.Navigateurl();
				}
				else if (action.equals("Username"))
				{
					keys.Username();
				}
				else if (action.equals("Password"))
				{
					keys.Password();
				}
				else if (action.equals("Login")) 
				{
				keys.Login();	
				}
				
			}
			else
			{
				System.out.println(action+"   Method Is skipped");
			}
			
		}
		
		
		
		
	}
	

}
