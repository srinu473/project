package com.orangeHRM.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class Screenshot extends Constants 
{
	
	public void Screenshot(int RowNo) throws IOException 
	{
		
			
		
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:\\sree\\MyProject\\OrangeHRM\\src\\com\\orangeHRM\\Screenshots\\image"+RowNo+".jpg" ));
		
		}
		

}
