package com.orangeHRM.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AddEmployeeTest extends Constants

{  
	@Test
	public void AddEmployeeTest() throws IOException
	{
		/*driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		orangeHRMloginPage lg=PageFactory.initElements(driver,orangeHRMloginPage.class);
		lg.orangeHRMloginPanel(U, P);  */
		
		
		menu mn=PageFactory.initElements(driver,menu.class);
		mn.PIM();
		mn.AddEmployee();
		AddEmployeePage ademp=PageFactory.initElements(driver, AddEmployeePage.class);
		
		int rowcount=EO.GetRowCount(path, 0);
		for (int i = 0; i <rowcount; i++)
			
		{
			mn.PIM();
			mn.AddEmployee();
			Row r=EO.GetRow(i+1, path,0);
			
			
		ademp.firstName.clear();	
		ademp.firstName.sendKeys(r.getCell(0).getStringCellValue());
		ademp.middleName.clear();
		ademp.middleName.sendKeys(EO.GetCellData(path, 0, i+1, 1));
		ademp.lastName.sendKeys(EO.GetCellData(path, 0, i+1, 2));
		ademp.employeeId.clear();
		ademp.employeeId.sendKeys(r.getCell(3).getStringCellValue());
		
		if (EO.GetCellData(path, 0, i+1, 4).contains("Y")) 
		{
			if (!ademp.chkLogin.isSelected())
			{
				ademp.chkLogin.click();
				ademp.user_name.clear();
				ademp.user_name.sendKeys(EO.GetCellData(path, 0, i+1, 5));
				ademp.user_password.clear();
				ademp.user_password.sendKeys(EO.GetCellData(path, 0, i+1, 6));
				ademp.re_password.clear();
				ademp.re_password.sendKeys(EO.GetCellData(path, 0, i+1, 7));
				ademp.status.sendKeys(EO.GetCellData(path, 0, i+1, 8));
				ademp.btnSave.click();
			} 
			else 
			{
				ademp.user_name.clear();
				ademp.user_name.sendKeys(EO.GetCellData(path, 0, i+1, 5));
				ademp.user_password.clear();
				ademp.user_password.sendKeys(EO.GetCellData(path, 0, i+1, 6));
				ademp.re_password.clear();
				ademp.re_password.sendKeys(EO.GetCellData(path, 0, i+1, 7));
				ademp.status.sendKeys(EO.GetCellData(path, 0, i+1, 8));
				ademp.btnSave.click();

			}
		}
		else
		{
			ademp.btnSave.click();
		}
		
		
		
		
		
		Screenshot sc=PageFactory.initElements(driver, Screenshot.class);
		sc.Screenshot(i);
		}
		
	}

}
