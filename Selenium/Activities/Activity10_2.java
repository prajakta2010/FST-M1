package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		Actions actions=new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		Thread.sleep(5000);
		System.out.println("Title of page is>>"+driver.getTitle());
		WebElement element=driver.findElement(By.xpath("//div[@id='keyPressed']"));
		actions.keyDown(Keys.SHIFT).sendKeys("p").keyUp(Keys.SHIFT).build().perform();
		System.out.println("Text>>"+element.getText());
		Thread.sleep(2000);
		actions.keyDown(Keys.CONTROL).
		sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		System.out.println("Text>>"+element.getText());
		driver.close();
	}

}
