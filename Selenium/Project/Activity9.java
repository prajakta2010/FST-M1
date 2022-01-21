package LMS_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void before() throws InterruptedException
	{
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver,10);
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals("My Account – Alchemy LMS", title);
		driver.findElement(By.xpath("//a[@href='#login']")).click();
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_pass"));
		WebElement login=driver.findElement(By.id("wp-submit"));
		username.sendKeys("root");
		password.sendKeys("pa$$w0rd");
		Thread.sleep(2000);
		login.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Alchemy LMS')]")));
	}
	
	
	@Test
	public void CompleteSimpleLesson() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='All Courses']")).click();
		driver.findElement(By.xpath("(//a[@href='https://alchemy.hguy.co/lms/courses/social-media-marketing/'])[2]")).click();
		Thread.sleep(2000);
		String TitleOfCourse=driver.getTitle();
		System.out.println("Title of Course is "+TitleOfCourse);
		Assert.assertEquals(TitleOfCourse, "Social Media Marketing – Alchemy LMS");
		driver.findElement(By.xpath("(//span[@class='ld-icon-arrow-down ld-icon ld-primary-background'])[1]")).click();
		
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
