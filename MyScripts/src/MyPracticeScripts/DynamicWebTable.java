package MyPracticeScripts;

import java.awt.Desktop.Action;
import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebTable 
{
	 static WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrm.com/");
			driver.manage().window().maximize();
			Sleeper.sleepTightInSeconds(3);
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
		    driver.findElement(By.id("btnLogin")).click();
		    Sleeper.sleepTightInSeconds(3);
		     
		    Actions action=new Actions(driver);
		    WebElement PIM=driver.findElement(By.linkText("PIM"));
		    action.moveToElement(PIM).build().perform();
		    driver.findElement(By.linkText("Employee List")).click();
		    Sleeper.sleepTightInSeconds(3);
		    
		    
		 }
		@Test
		public void WebTableTest() throws IOException
		{
			
			FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResults.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheetAt(0);
			
			
			WebElement table=driver.findElement(By.tagName("table"));
			java.util.List<WebElement> rows=table.findElements(By.tagName("tr"));
			for (int i = 0; i < rows.size(); i++) 
			{
				XSSFRow r=ws.createRow(i);
				java.util.List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
				for (int j = 1; j < cells.size(); j++) 
				{
					String x=cells.get(j).getText();
					
					
					XSSFCell c=r.createCell(j-1);
					c.setCellValue(x);
					
				
					System.out.print(x+"       ");
					
					
				}
				System.out.println();
				
			}
			FileOutputStream fo=new FileOutputStream("D:\\sree\\MyProject\\MyScripts\\src\\ExcelFiles\\WebtableResultsOP.xlsx");
			wb.write(fo);
			
		}

}
