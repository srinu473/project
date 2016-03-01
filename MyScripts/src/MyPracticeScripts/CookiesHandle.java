package MyPracticeScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CookiesHandle 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		
		driver.get("http://mirror.co.uk");
		

	}
	@Test
	
	public void cookies()
	{
		Set<Cookie> mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		Iterator<Cookie> itr=mycookies.iterator();
		while(itr.hasNext())
		{
			Cookie c=itr.next();
			System.out.println(c.getName()+"-----------"+c.getDomain());
		}
		driver.manage().deleteAllCookies();
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		
		
	}
}
