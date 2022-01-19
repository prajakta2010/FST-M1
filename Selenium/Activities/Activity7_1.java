package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement username=driver.findElement(By.xpath("//input[starts-with(@class,'username')]"));
		WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password')]"));
		username.sendKeys("admin");
		password.sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"), "Welcome Back, admin"));
		System.out.println(driver.findElement(By.id("action-confirmation")).getText());
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
