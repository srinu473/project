package MyPracticeScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NotPresentEement2 {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		
		
		try 
		{
		d.findElement(By.linkText("qedge")).click();	
		} 
		catch (Exception e) 
		{
			File srcFile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("D:\\sree\\MyProject\\MyScripts\\src\\Screenshots\\image.jpg"));
		} 
		

	}

}
