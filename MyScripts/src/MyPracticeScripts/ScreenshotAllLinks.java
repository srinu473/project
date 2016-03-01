package MyPracticeScripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotAllLinks {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://newtours.demoaut.com");
		List<WebElement> links=d.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			if (links.get(i).isDisplayed()) 
			{
				String linkname=links.get(i).getText();
				links.get(i).click();
				File srcFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File("D:\\sree\\MyProject\\MyScripts\\src\\Screenshots\\"+linkname+".jpg"));
				d.navigate().back();
				links=d.findElements(By.tagName("a"));
				
				
			}
			
		}
				
		

	}

}
