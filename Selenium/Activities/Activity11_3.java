package selenium_activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of page is>>"+driver.getTitle());
		Thread.sleep(2000);
		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		Thread.sleep(2000);
		Alert prompt_Alert=driver.switchTo().alert();
		System.out.println(prompt_Alert.getText());
		prompt_Alert.sendKeys("Yes, You are!");
		Thread.sleep(2000);
		prompt_Alert.accept();
		driver.close();
	}

}
