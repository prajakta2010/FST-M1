package LMS_Project;

import java.util.List;

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

public class Activity7 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void before() throws InterruptedException
	{
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver,10);
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		String title=driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals("My Account – Alchemy LMS", title);
		driver.findElement(By.xpath("//a[@href='#login']")).click();
		WebElement username=driver.findElement(By.id("user_login"));
		WebElement password=driver.findElement(By.id("user_pass"));
		WebElement login=driver.findElement(By.id("wp-submit"));
		username.sendKeys("root");
		password.sendKeys(" pa$$w0rd");
		login.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Alchemy LMS')]")));
	}
	
	
	@Test
	public void CountCourses() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='All Courses']")).click();
		Thread.sleep(2000);
		List<WebElement> courses=driver.findElements(By.xpath("//div[contains(@class,'ld_course_grid col-sm-8 col-md-4 ')]"));
		System.out.println("Number of courses present are >>"+courses.size());
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}


}
