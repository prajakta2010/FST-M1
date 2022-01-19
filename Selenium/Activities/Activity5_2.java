package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox Select value >> "+checkbox.isSelected());
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println("After click on Checkbox ,Checkbox Select value >> "+checkbox.isSelected());
		driver.close();
		

	}

}
