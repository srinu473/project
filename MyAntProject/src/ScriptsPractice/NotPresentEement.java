package ScriptsPractice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NotPresentEement 
{

	public static void main(String[] arg) throws IOException
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		
		List<WebElement> links=d.findElements(By.linkText("Qedge"));
		if (links.size()==0)
		{ 
			File srcFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:\\sree\\MyProject\\MyScripts\\src\\Screenshots\\google.jpg"));
			
			//File srFile=((TakesScreenshot)d.getScreenshotAs(OutputType.FILE));
			//FileUtils.copyFile(srcFile,new File("D:\\sree\\MyProject\\MyScripts\\src\\Screenshots\\google.jpg"));
		
	
			
			
		}
		else
		{
			d.findElement(By.linkText("qedge")).click();
		}
		

	}

}
