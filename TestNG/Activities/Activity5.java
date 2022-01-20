package TestNGactivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	
	@BeforeTest(alwaysRun=true)
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}
	
	@Test(groups= {"HeaderTests","ButtonTests"})
	public void PageTitleTest()
	{
		Assert.assertEquals("Target Practice", driver.getTitle());
	}
	
	@Test(dependsOnMethods={"PageTitleTest"},groups= {"HeaderTests"})
	public void Header1()
	{
		String third_header=driver.findElement(By.id("third-header")).getText();
		Assert.assertEquals("Third header", third_header);
		String color_fifthheader=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
		Assert.assertEquals("rgb(33, 186, 69)", color_fifthheader);
		
	}
	
	@Test(dependsOnMethods={"PageTitleTest"},groups= {"HeaderTests"})
	public void Header2()
	{
		
		String color_fifthheader=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color");
		Assert.assertEquals("rgb(33, 186, 69)", color_fifthheader);
		
	}
	
	@Test(dependsOnMethods={"PageTitleTest"},groups= {"ButtonTests"})
	public void Button1()
	{
		String olivetext=driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
		Assert.assertEquals("Olive", olivetext);
		
		
	}
	
	@Test(dependsOnMethods={"PageTitleTest"},groups= {"ButtonTests"})
	public void Button2()
	{
		
		String buttoncolor=driver.findElement(By.xpath("//button[@class='ui brown button']")).getCssValue("background-color");
		Assert.assertEquals("rgb(165, 103, 63)", buttoncolor);
		
	}
	
	@AfterTest(alwaysRun=true)
	public void after()
	{
		driver.close();
	}
}
