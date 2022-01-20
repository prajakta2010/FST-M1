package TestNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	
	WebDriver driver;
	@BeforeClass
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@Test
	public void method()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		String expectedmsg=driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals("Welcome Back, admin",expectedmsg);
	}


	@AfterClass
	public void after()
	{
		driver.close();
	}
}
