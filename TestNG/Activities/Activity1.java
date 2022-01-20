package TestNGactivities;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	
	WebDriver driver;
  @BeforeMethod
  public void beforetrainingpage() throws InterruptedException
  {
	  System.out.println("In beforetrainingpage method "); 
	  driver =new FirefoxDriver();
	   driver.get("https://www.training-support.net");
	   Thread.sleep(5000);
	   System.out.println("Driver object created");
	 
  }
  @Test
  public void trainingpage() {
	  
	   System.out.println("In trainingpage method ");
	   String title=driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals(title, "Training Support");
	   driver.findElement(By.xpath("//a[@id='about-link']")).click();
	   String title1=driver.getTitle();
	   System.out.println(title1);
	   Assert.assertEquals(title1, "About Training Support");
	   
  }
  
  @AfterMethod
  public void aftertrainingpage()
  {
	  System.out.println("In aftertrainingpage method ");
	  driver.quit();
	  System.out.println("quit the browser");
  }
  
  
 
}
