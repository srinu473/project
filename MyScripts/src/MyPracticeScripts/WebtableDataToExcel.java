package MyPracticeScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebtableDataToExcel 
{
	@Test
	public void WebtableDataToExcel() throws IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResults.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(0);
		Row r=null;
		
		WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			r=ws.createRow(i);
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++)
			{
				
			Cell c=r.createCell(j);
			c.setCellValue(cols.get(j).getText());
			
				
			}
			
		}
		FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResults.xlsx");
		wb.write(fo);
		
		
	}
	

}
