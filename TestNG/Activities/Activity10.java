package TestNGactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity10 {

	WebDriver driver;
	Actions builder;

	@BeforeTest
	public void SetUp()
	{

		driver=new FirefoxDriver();
		builder=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.training-support.net/selenium/sliders");	
	}

	@Test(priority=1)
	public void middlevalue() throws InterruptedException
	{
		WebElement slider = driver.findElement(By.id("slider"));
		slider.click();
		Thread.sleep(5000);
		String slidervalue = driver.findElement(By.id("value")).getText();
		Reporter.log("Mid Value : "+slidervalue);
		Assert.assertEquals(slidervalue, "50");
		
	}
	@Test(priority=2)
	public void maximumvalue() throws InterruptedException
	{
		WebElement slider = driver.findElement(By.id("slider"));
		builder.clickAndHold(slider).moveByOffset(75, 0).release().build().perform();
		Thread.sleep(5000);
		String slidervalue = driver.findElement(By.id("value")).getText();
		Reporter.log("Max Value : "+slidervalue);
		Assert.assertEquals(slidervalue, "100");
	}
	@Test(priority=3)
	public void minimumvalue() throws InterruptedException
	{
		WebElement slider = driver.findElement(By.id("slider"));
		builder.clickAndHold(slider).moveByOffset(-75, 0).release().build().perform();
		Thread.sleep(5000);
		String slidervalue = driver.findElement(By.id("value")).getText();
		Reporter.log("Min Value : "+slidervalue);
		Assert.assertEquals(slidervalue, "0");
	}
	@Test(priority=4)
	public void value_30() throws InterruptedException
	{
		WebElement slider = driver.findElement(By.id("slider"));
		builder.clickAndHold(slider).moveByOffset(-30, 0).release().build().perform();
		Thread.sleep(5000);
		String slidervalue = driver.findElement(By.id("value")).getText();
		Reporter.log("Value : "+slidervalue);
		Assert.assertEquals(slidervalue, "30");
	}
	@Test(priority=5)
	public void value_80() throws InterruptedException
	{
		WebElement slider = driver.findElement(By.id("slider"));
		builder.clickAndHold(slider).moveByOffset(44, 0).release().build().perform();
		Thread.sleep(5000);
		String slidervalue = driver.findElement(By.id("value")).getText();
		Reporter.log("Value : "+slidervalue);
		Assert.assertEquals(slidervalue, "80");
	}

	

	@AfterTest
	public void TearDown()
	{
		driver.close();

	}

}
