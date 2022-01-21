package LMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	
	@Test
	public void verifyWebdsiteHeading() throws InterruptedException
	{
		String heading=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
		Thread.sleep(5000);
		Assert.assertEquals("Learn from Industry Experts", heading);
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
