package MyPracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mysql.jdbc.Driver;

public class google {

	public static void main(String[] args) 
	{
    FirefoxDriver d=new FirefoxDriver();
    d.get("http://www.goglogo.com/");
    d.findElement(By.xpath(".//*[@id='main']/div[2]/div[2]/form/table/tbody/tr[1]/td/input")).sendKeys("BHASHA");
    d.findElement(By.className("create-logo-button")).click();
	}

}
