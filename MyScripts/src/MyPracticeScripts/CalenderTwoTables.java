package MyPracticeScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalenderTwoTables 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		switchAlert();
		driver.get("http://www.cleartrip.com/");
		driver.findElement(By.id("OneWay")).click();
	    driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	    driver.findElement(By.id("ToTag")).sendKeys("Brisbane, AU - Brisbane (BNE)");
	
	
     }
	@Test
	public void Calander()
	{
		driver.findElement(By.id("DepartDate")).click();
		String doj="05/12/2017";
		String[] a=doj.split("/");
		String date=a[0];
		
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		String year=a[2];
		
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		String calyear2=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year))
		{
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/a")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			calyear2=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/span[2]")).getText();
			System.out.println(calyear+"     "+calyear2);
		}
		
		 String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equals(month))
		{
			driver.findElement(By.xpath("html/body/div[1]/div[2]/div/a")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		/*WebElement table=driver.findElement(By.className("calendar"));
		java.util.List<WebElement> rows=table.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++)
		{
			java.util.List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
		  {
			
			if (date.contains(cols.get(j).getText()))
		     {
			 
		        cols.get(j).click();
			     break;
			  }	
			
				
		   }
			
		} */
		
		
		
		
	}
	
	public void switchAlert()
	{
		try 
		{
		 Alert alert=driver.switchTo().alert();
		 alert.dismiss();
		} catch (Exception e)
		{
			
		}
	}


}
