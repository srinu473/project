package com.orangeHRM.testsuite;


import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends Constants
{
	//String path="E:\\sree\\MyProject\\OrangeHRM\\src\\com\\orangeHRM\\Excel\\LoginData.xlsx";
	@Test
	public void loginTest() throws IOException
	{
		
		driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrm.com/");
		orangeHRMloginPage log=PageFactory.initElements(driver, orangeHRMloginPage.class);
		log.orangeHRMloginPanel(U, P);

		
		/* Row r=EO.GetRow(1, path, 0);
		int rcount=EO.GetRowCount(path, 0);
		for(int i=1;i<=rcount;i++)
		{
			log.orangeHRMloginPanel(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		} */
	}

	
}
