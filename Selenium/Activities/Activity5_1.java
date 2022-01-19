package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox display >> "+checkbox.isDisplayed());
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		System.out.println("After click on Remove checkbox button ,Checkbox display >> "+checkbox.isDisplayed());
		driver.close();

	}

}
