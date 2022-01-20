package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		WebElement first_heading=driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println(first_heading.getText());
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		WebElement second_heading=driver.findElement(By.xpath("//div[@class='content']"));
		System.out.println(second_heading.getText());
		driver.close();
		
	}

}
