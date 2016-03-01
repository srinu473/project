package MyPracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Htmlunitdriver 
{

	public static void main(String[] args) 
	{
		HtmlUnitDriver driver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		driver.get("http://opensource.demo.orangehrm.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("btnLogin")).getAttribute("name"));
		

	}

}
