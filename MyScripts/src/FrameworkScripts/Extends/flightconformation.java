package FrameworkScripts.Extends;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class flightconformation extends constants
{
	@Test
	public void flightconformation()
	{
	String fc=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
	if (fc.contains("has been booked!"))
	{
		System.out.println("flight booking successfull");
		
		
	}
	else
	{
		System.out.println("flight booking unsuccessfull");
	}
	
	}

}
