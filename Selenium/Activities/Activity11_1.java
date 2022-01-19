package selenium_activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of page is>>"+driver.getTitle());
		Thread.sleep(2000);
		WebElement simplealert=driver.findElement(By.id("simple"));
		simplealert.click();
		Alert simpleAlert = driver.switchTo().alert();
		String Alerttext=simpleAlert.getText();
		System.out.println("Alerttext>>>"+Alerttext);
		Thread.sleep(2000);
		simpleAlert.accept();
		driver.close();
	}
	

}
