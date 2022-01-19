package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement textbox=driver.findElement(By.xpath("//input[@id='input-text']"));
		System.out.println("Textbox enable value  >>  "+textbox.isEnabled());
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		Thread.sleep(5000);
		System.out.println("After click on Enble Input button, Textbox enable value  >>  "+textbox.isEnabled());
		driver.close();
	}

}
