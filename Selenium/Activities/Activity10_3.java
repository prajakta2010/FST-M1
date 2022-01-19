package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		Actions actions=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/drag-drop");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
		System.out.println("Title of page is>>"+driver.getTitle());
		WebElement objball=driver.findElement(By.id("draggable"));
		WebElement firstplace=driver.findElement(By.id("droppable"));
		WebElement secondplace=driver.findElement(By.id("dropzone2"));
		actions.dragAndDrop(objball, firstplace).perform();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(firstplace, "background-color"));
	    System.out.println("ENTERED DROPZONE 1");
		actions.dragAndDrop(objball, secondplace).perform();
		wait.until(ExpectedConditions.attributeToBeNotEmpty(secondplace, "background-color"));
		System.out.println("ENTERED DROPZONE 2");
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
