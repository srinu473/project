package FrameworkScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class keywordUsingProperty
{
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new FirefoxDriver();
	driver.get("http://opensource.demo.orangehrm.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void KeywordProperty() throws IOException
	{
		FileInputStream f=new FileInputStream("D:\\sree\\MyProject\\MyScripts\\OrangeHRM.properties");
		Properties pr=new Properties();
		pr.load(f);
		
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.xpath(pr.getProperty("login"))).click();
		
	}
	
}

