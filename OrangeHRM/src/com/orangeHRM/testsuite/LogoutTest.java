package com.orangeHRM.testsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.Page;

public class LogoutTest extends Constants
{
	@Test
	public void logout()
	{
		/* driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		orangeHRMloginPage log=PageFactory.initElements(driver, orangeHRMloginPage.class);
		log.orangeHRMloginPanel(U, P); */
		Sleeper.sleepTightInSeconds(5);
		menu mn=PageFactory.initElements(driver, menu.class);
		mn.welcome.click();
		mn.Logout.click();
	}

}
