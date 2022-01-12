package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("meena");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("wagh");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("meena@wagh.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("1234567891");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
	}

}
