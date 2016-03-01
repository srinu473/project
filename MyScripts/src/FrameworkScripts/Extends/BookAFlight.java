package FrameworkScripts.Extends;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookAFlight extends constants
{ 
	@Test
	public void bookaflight()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("pavan");
		driver.findElement(By.name("creditnumber")).sendKeys("2222222111111111");
		driver.findElement(By.name("buyFlights")).click();
	}
	

}
