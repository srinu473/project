package FrameworkScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords 
{
	FirefoxDriver driver;
	public void Launchbrowser()
	{
		driver=new FirefoxDriver();
	}
	public void Navigateurl()
	{
		driver.get("http://opensource.demo.orangehrm.com/");
	}
	public void Username()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	
	public void Password()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	
	public void Login()
	{
		driver.findElement(By.id("btnLogin")).click();
	}

}
