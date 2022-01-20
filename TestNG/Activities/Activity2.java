package TestNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;

	@BeforeClass
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}
	@Test
	public void method1()
	{
		
		System.out.println("Title of the page is >>"+driver.getTitle());
	}
	@Test
	public void method2()
	{
		
		WebElement button=driver.findElement(By.xpath("//button[@class='ui black button']"));
		Assert.assertEquals("Grey", button.getText());
		
	}
	@Test(enabled=false)
	public void method3()
	{
		System.out.println("Method Third");
		
	}
	@Test
	public void method4()
	{
		throw new SkipException ("Fourth Method Skipped");
		
	}
	
	@AfterClass
	public void after()
	{
		driver.close();
	}
}
