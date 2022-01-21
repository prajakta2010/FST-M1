package LMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	
	@Test
	public void verifyTitleofFirstinfoBox() throws InterruptedException
	{
		String firstinfo=driver.findElement(By.xpath("//h3[contains(text(),'Actionable')]")).getText();
		Thread.sleep(5000);
		//System.out.println(firstinfo);
		Assert.assertEquals("Actionable Training", firstinfo);
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
