package ScriptsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.findElement(By.cssSelector("input[id^='txt']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id$='word']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id*='Log']")).click();
		

	}

}
