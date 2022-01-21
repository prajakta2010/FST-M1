package LMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity4 {
	
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		driver=new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
	}
	
	
	@Test
	public void verifyTitleofSecondCourse() throws InterruptedException
	{
		String second_pop_course=driver.findElement(By.xpath("//h3[starts-with(text(),'Email')]")).getText();
		Thread.sleep(5000);
		//System.out.println(second_pop_course);
		Assert.assertEquals("Email Marketing Strategies", second_pop_course);
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
