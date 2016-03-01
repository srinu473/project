package FrameworkScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;

import javax.xml.crypto.KeySelectorException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReflectionKeywordDrivenTest 
{
	LoginKeywords keys=new LoginKeywords();
	Method[] mymethods=keys.getClass().getMethods();
	@Test
	public void reflectionKeyword() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{LoginKeywords keys=new LoginKeywords();
	FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\KeywordData.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while (row.hasNext())
	{
		Row r=row.next();
		String runmode=r.getCell(4).getStringCellValue();
		if (runmode.equals("Y"))
		{
			String action=r.getCell(3).getStringCellValue();
			executeAction(action);
		}
		
	}
		
	}
	
	public void executeAction(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for (int i = 0; i < mymethods.length; i++)
		{
			if (action.equals(mymethods[i].getName()))
			{
				mymethods[i].invoke(keys);
				break;
				
			}
			
		}
		
		
	}

}
