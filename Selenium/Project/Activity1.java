package LMS_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	
	@Test
	public void verifyTitle() throws InterruptedException
	{
		String title=driver.getTitle();
		Thread.sleep(5000);
		Assert.assertEquals("Alchemy LMS – An LMS Application", title);
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}

}
