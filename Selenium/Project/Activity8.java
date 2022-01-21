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

public class Activity8 {
	
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest
	public void before()
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
	public void NavigatetoContactUS() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Contact']")).click();
		Thread.sleep(5000);
		WebElement fullname=driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
		WebElement  email=driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']"));
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		fullname.sendKeys("Jaya D");
		email.sendKeys("Jaya@D.com");
		submit.click();
		Thread.sleep(2000);
		WebElement errormsg=driver.findElement(By.xpath("//label[@id='wpforms-8-field_2-error']"));
		System.out.println(errormsg.getText());
		
		
	}
	@AfterTest
	public void after()
	{
		driver.close();
	}



}
