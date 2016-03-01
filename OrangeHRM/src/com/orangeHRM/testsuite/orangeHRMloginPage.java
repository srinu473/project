package com.orangeHRM.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class orangeHRMloginPage 
{
	@FindBy(id="txtUsername")
	WebElement Username;
	@FindBy(id="txtPassword")
	WebElement Password;
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public void orangeHRMloginPanel(String U,String P)
	{
		Username.sendKeys(U);
		Password.sendKeys(P);
		Login.click();
	}
	
	
	
	

}
