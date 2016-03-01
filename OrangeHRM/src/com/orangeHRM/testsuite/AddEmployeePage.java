package com.orangeHRM.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage 

{
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="employeeId")
	WebElement employeeId;
	@FindBy(id="chkLogin")
	WebElement chkLogin;
	@FindBy(id="user_name")
	WebElement user_name;
	@FindBy(id="user_password")
	WebElement user_password;
	@FindBy(id="re_password")
	WebElement re_password;
	@FindBy(id="status")
	WebElement status;
	@FindBy(id="btnSave")
	WebElement btnSave;
	public void AddEmployee()
	{
		firstName.sendKeys("");
		middleName.sendKeys("");
		lastName.sendKeys("");
		employeeId.sendKeys("");
		chkLogin.click();
		user_name.sendKeys("");
		user_password.sendKeys("");
		re_password.sendKeys("");
		status.sendKeys("");
		btnSave.click();
		
	}

}
