package MyPracticeScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerticalSlider 
{
	static WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/#slider-vertical");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
		
		
	}
	@Test
	public void SliderTest()
	
	{
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider-vertical']/span"));
		int X=slider.getLocation().x;
		int Y=slider.getLocation().y;
		System.out.println(X+"    "+Y);
		action.dragAndDropBy(slider, X,110).build().perform();
		
		
	}


}
