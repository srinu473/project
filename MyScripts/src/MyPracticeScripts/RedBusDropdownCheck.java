package MyPracticeScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class RedBusDropdownCheck {

	public static void main(String[] args)
	{
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://redbus.in");
		String frcity="hyderabad";
		String[] c=frcity.split("");
		System.out.println(c.length);
		WebElement f=d.findElement(By.id("txtSource"));
		
		for (int i = 1; i < c.length; i++)
		{
			System.out.println(c[i]);
			f.sendKeys(c[i]);
			Sleeper.sleepTightInSeconds(2);
            WebElement al=d.findElement(By.className("autoFill"));
            List<WebElement> cs=al.findElements(By.tagName("li"));
            System.out.println(cs.size());
            for (int j = 0; j < cs.size(); j++) 
            {
			 System.out.println(cs.get(j).getText());
			 if (frcity.equalsIgnoreCase(cs.get(j).getText()))
			 {
				 cs.get(j).click();
				 f.clear();
				 //Sleeper.sleepTightInSeconds(2);
				
			}
			}
            
			
			
		}
		
		
		
		

	}

}
