package TestNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver;
	@BeforeClass
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}

	@Test
	@Parameters({"username","password"})
	public void Login(String username,String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
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
