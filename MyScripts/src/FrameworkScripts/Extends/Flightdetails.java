package FrameworkScripts.Extends;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class Flightdetails extends constants
{
 @Test
 public void flightdetails()
 {
	 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
	 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/b/select")).sendKeys("1");
	 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/select")).sendKeys("London");
	 
	 driver.findElement(By.name("findFlights")).click();
 }

}
