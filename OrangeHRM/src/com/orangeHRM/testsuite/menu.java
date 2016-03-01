package com.orangeHRM.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class menu
{
	@FindBy(linkText="Admin")
	WebElement Admin;
	public void Admin()
	{
		Admin.click();
	}
	@FindBy(linkText="PIM")
	WebElement PIM;
	public void PIM()
	{
		PIM.click();
	}
	@FindBy(linkText="Leave")
	WebElement Leave;
	public void Leave()
	{
		Leave.click();
	}
	@FindBy(linkText="Time")
	WebElement Time;
	public void Time()
	{
		Time.click();
	}
	@FindBy(linkText="Recruitment")
	WebElement Recruitment;
	public void Recruitment()
	{
		Recruitment.click();
	}
	@FindBy(linkText="Performance")
	WebElement Performance;
	public void Performance()
	{
		Performance.click();
	}
	@FindBy(linkText="Dashboard")
	WebElement Dashboard;
	public void Dashboard()
	{
		Dashboard.click();
	}
	@FindBy(id="welcome")
	WebElement welcome;
	public void welcome()
	{
		welcome.click();
	}
	@FindBy(linkText="Logout")
	WebElement Logout;
	public void Logout()
	{
		Logout.click();
	}
	@FindBy(id="menu_pim_addEmployee")
	WebElement AddEmployee;
	public void AddEmployee()
	{
		AddEmployee.click();
	}
	
	

}
