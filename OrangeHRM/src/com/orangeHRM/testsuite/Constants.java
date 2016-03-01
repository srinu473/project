package com.orangeHRM.testsuite;

import org.openqa.selenium.WebDriver;

import com.gargoylesoftware.htmlunit.Page;
import com.orangeHRM.Utility.ExcelOperations;


public class Constants
{
	static WebDriver driver;
	String U="Admin";
	String P="admin";
	String path="D:\\sree\\MyProject\\OrangeHRM\\src\\com\\orangeHRM\\Excel\\AddEmployeeData.xlsx";
	String path1="D:\\sree\\MyProject\\OrangeHRM\\src\\com\\orangeHRM\\Dataengine\\OrangeHRM TestCases.xlsx";
	ExcelOperations EO=new ExcelOperations();
}
