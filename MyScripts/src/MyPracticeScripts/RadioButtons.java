package MyPracticeScripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtons 
{
	FirefoxDriver d;
	@BeforeTest
	public void setup()
   {
		d=new FirefoxDriver();
		d.get("http://www.echoecho.com/htmlforms10.htm");
		
				
   }
	@Test
	public void radiobuttoncheck()
	{
		WebElement block=d.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td"));
		for (int i = 1; i <= 2; i++)
		{
		List<WebElement> radio=block.findElements(By.name("group"+i));
		for (int j = 0; j < radio.size(); j++)
		{
			radio.get(j).click();
			for (int k = 0; k < radio.size(); k++)
			{
			 System.out.println(radio.get(k).getAttribute("value")+"-----"+radio.get(k).getAttribute("checked"));	
			}
			System.out.println("#####################################");
			
		}
		System.out.println("****************************************************************");
		
		}
		
	}
	
	@AfterTest
	public void closeapp()
	{
		d.close();
	}
}
