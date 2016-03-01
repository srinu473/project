package MyPracticeScripts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Searchunknownelement {

	public static void main(String[] args) 
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://google.com");
		String str=d.getPageSource();
		System.out.println(str);
		if (str.contains("DumpException"))
		{
		System.out.println("Element present");	
		}
		else
		{
			System.out.println("Element not present");	
		}
		

	}

}
