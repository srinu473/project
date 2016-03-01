package MyPracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutomateCaptche {

	public static void main(String[] args) 
	{
		int t=0;
		while (t<=0) 
		{
			
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://www.harvard.edu/feedback");
		d.findElement(By.id("edit-submitted-name")).sendKeys("harish");
		d.findElement(By.id("edit-submitted-email")).sendKeys("sri123@gmail.com");
		d.findElement(By.id("edit-submitted-comment")).sendKeys("good");
       String x= d.findElement(By.className("field-prefix")).getText();
       String[] a=x.split(" ");
       int i=Integer.parseInt(a[0]);
       int j=Integer.parseInt(a[2]);
       int k=i+j;
       String st=Integer.toString(k);
       
       d.findElement(By.xpath(".//*[@id='edit-captcha-response']")).sendKeys(st);
       Sleeper.sleepTightInSeconds(2);
       d.findElement(By.xpath("//*[@id='webform-client-form-1884']/div/div[5]/input")).click();
		}
		

	}

}
