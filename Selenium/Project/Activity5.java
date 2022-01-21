package LMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	
	@Test
	public void NavigateToMyAccount() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals("My Account – Alchemy LMS", title);
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
