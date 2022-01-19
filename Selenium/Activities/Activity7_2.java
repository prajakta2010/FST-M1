package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) throws InterruptedException {

			WebDriver driver=new FirefoxDriver();
			WebDriverWait wait=new WebDriverWait(driver,10);
			driver.get("https://training-support.net/selenium/dynamic-attributes");
			Thread.sleep(5000);
			WebElement username=driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
			WebElement password=driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
			WebElement confirmpassword=driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input[1]"));
			WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
			WebElement signup=driver.findElement(By.xpath("//button[text()='Sign Up']"));
			username.sendKeys("abc");
			password.sendKeys("xyz");
			confirmpassword.sendKeys("xyz");
			email.sendKeys("abc@xyz.com");
			signup.click();
			WebElement welcometext=driver.findElement(By.id("action-confirmation"));
			wait.until(ExpectedConditions.textToBePresentInElement(welcometext, "Thank you for registering, abc"));
			System.out.println(welcometext.getText());
			Thread.sleep(5000);
			driver.close();
	}

}
