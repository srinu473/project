package MyPracticeScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StaticWebTable 
{ 
	
	 static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		
	}
	@Test(priority=1)
	public void webtableOneColumDataTest1() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResults.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(1);
	  
	
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
	    String part2="]/td[1]";
	for (int i = 1; i < 37; i++) 
	{
		String x=driver.findElement(By.xpath(part1+i+part2)).getText();
		XSSFRow r=ws.createRow(i-1);
		XSSFCell c=r.createCell(0);
		c.setCellValue(x);
		
		
		
		
	}
	FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResultsOP.xlsx");
	wb.write(fo);
	
		
	}
	@Test(priority=0)
	
	public void WebTableEntairData() throws IOException
	
	{
		 
			
		String part1="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResults.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheetAt(0);
		
		
		for (int i = 1; i < 37; i++)
		{
			XSSFRow r=ws.createRow(i-1);
			for (int j = 1; j < 9; j++) 
			{
				String x=driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();
				
				XSSFCell c=r.createCell(j-1);
				c.setCellValue(x);
				
				
		  }
			
			
		}
		FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResultsOP.xlsx");
		wb.write(fo);
		
		
		
		
	}
	

}
