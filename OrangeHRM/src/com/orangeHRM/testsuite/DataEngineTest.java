package com.orangeHRM.testsuite;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DataEngineTest extends Constants 
{
	@Test
	public void dataengintest() throws IOException
	{
		LoginTest lg=PageFactory.initElements(driver, LoginTest.class);
		AddEmployeeTest ae=PageFactory.initElements(driver, AddEmployeeTest.class);
		LogoutTest lo=PageFactory.initElements(driver, LogoutTest.class);
		int rowcount=EO.GetRowCount(path1, 0);
		
		for (int i = 0; i <rowcount; i++)
		{
			String runmode=EO.GetCellData(path1, 0, i+1, 2);
			String key=EO.GetCellData(path1, 0, i+1, 1);
			if (runmode.equals("Y"))
			{
				if (key.equalsIgnoreCase("LoginTest")) 
				{
					lg.loginTest();
				}
				else if (key.equalsIgnoreCase("AddEmployeeTest")) 
				{
					ae.AddEmployeeTest();
				}
				else if (key.equalsIgnoreCase("LogoutTest")) 
				{
					lo.logout();
				}
			}
				
				else
				{
					
					
					System.out.println(key+" is not in  executable mode");
				}
			}
			
			
			
		}
	

}
