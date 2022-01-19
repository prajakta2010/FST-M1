package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		Thread.sleep(10000);
		System.out.println("Title of Page is >>"+driver.getTitle());
		WebElement element=driver.findElement(By.xpath("//a[contains(text(), 'About')]"));
		element.click();
		Thread.sleep(10000);
		System.out.println("Title of Page is >>"+driver.getTitle());
		driver.close();

	}

}
