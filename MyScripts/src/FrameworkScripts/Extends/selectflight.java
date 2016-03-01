package FrameworkScripts.Extends;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class selectflight extends constants
{
	@Test
	public void selectflight()
    {
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
	}
	

}
