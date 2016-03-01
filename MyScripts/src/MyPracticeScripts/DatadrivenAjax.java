package MyPracticeScripts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenAjax 
{
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
	}
	@Test
	public void ajaxdata() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Iterator<Row>  row=ws.iterator();
		row.next();
		while (row.hasNext())
		{
			Row r=row.next();
			String PhNo=r.getCell(0).getStringCellValue();
			driver.findElement(By.name("mobileNumber")).clear();
			driver.findElement(By.name("mobileNumber")).sendKeys(PhNo);
			driver.findElement(By.name("amountPaid")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			
			if (ajax.getText().isEmpty())
		    {
				actajax="no ajax";
			}
			else
			{
				actajax=ajax.getText();
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if (actajax.equals(expajax))
			{
				r.createCell(3).setCellValue("Passed");
			}	
			else
			{
				r.createCell(3).setCellValue("Failed");
			}
			
			
		}
		
		FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ResultsExcel\\ajaxResults.xlsx");
		wb.write(fo);
		
	}

}
