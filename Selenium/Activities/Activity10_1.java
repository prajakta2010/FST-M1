package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		Thread.sleep(5000);
		System.out.println("Title of page is>>"+driver.getTitle());
		Actions builder=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//div[@id='D3Cube']"));
		builder.moveToElement(element).click().build().perform();
		Thread.sleep(2000);
		System.out.println("After Left Click ,Text on Cube is"+driver.findElement(By.xpath("//div[@class='active']")).getText());
		builder.doubleClick(element).build().perform();
		Thread.sleep(5000);
		System.out.println("After double click,Text on Cube is"+driver.findElement(By.xpath("//div[@class='active']")).getText());
		builder.contextClick(element).build().perform();
		Thread.sleep(2000);
		System.out.println("After right click ,Text on Cube is"+driver.findElement(By.xpath("//div[@class='active']")).getText());
		driver.close();
	}

}
