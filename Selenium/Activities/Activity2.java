package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement id=driver.findElement(By.id(""));
		driver.close();

	}

}
