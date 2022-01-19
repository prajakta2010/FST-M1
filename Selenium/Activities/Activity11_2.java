package selenium_activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of page is>>"+driver.getTitle());
		Thread.sleep(2000);
		WebElement confirmalert=driver.findElement(By.id("confirm"));
		confirmalert.click();
		Thread.sleep(2000);
		Alert confirm_Alert=driver.switchTo().alert();
		System.out.println(confirm_Alert.getText());
		confirm_Alert.accept();
		Thread.sleep(2000);
		//confirm_Alert.dismiss();
		driver.close();
	}

}
