package FrameworkScripts.Extends;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logout extends constants
{
	@Test
	public void logout()
	{
	driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img")).click();
	}

}
