package TestNGactivities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
	    Reporter.log("Starting Test |");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		Reporter.log("I am in BeforeTest |");
		
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		driver.switchTo().defaultContent();
		Reporter.log("I am in BeforeMethod |");
	}
	
	@Test(priority=1)
	public void simpleAlertTestCase()
	{
		WebElement simplealert=driver.findElement(By.id("simple"));
		simplealert.click();
		Alert simpleAlert = driver.switchTo().alert();
		String Alerttext=simpleAlert.getText();
		System.out.println("Simple Alert Text:=>"+Alerttext);
		simpleAlert.accept();
		Reporter.log("I am in simpleAlertTestCase method |");
	}
	
	@Test(priority=2)
	public void confirmAlertTestCase()
	{
		WebElement confirmalert=driver.findElement(By.id("confirm"));
		confirmalert.click();
		Alert confirm_Alert=driver.switchTo().alert();
		System.out.println("Confirm Alert Text:=>"+confirm_Alert.getText());
		confirm_Alert.accept();
		Reporter.log("I am in confirmAlertTestCase method |");
		
	}
	
	@Test(priority=2)
	public void promptAlertTestCase()
	{
		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		Alert prompt_Alert=driver.switchTo().alert();
		System.out.println(prompt_Alert.getText());
		prompt_Alert.sendKeys("Yes, You are!");
		prompt_Alert.accept();
		Reporter.log("I am in promptAlertTestCase method |");
		
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.close();
		Reporter.log("I am in AfterTest |");
		Reporter.log("End Test |");
	}

}
