package selenium_activities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Set<String> allwindow;
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println("Title of page is>>"+driver.getTitle());
		String handle=driver.getWindowHandle();
		System.out.println("Parent window handle>>> "+handle);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Me!")).click();
		
		//after open second window
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		allwindow=driver.getWindowHandles();
		System.out.println("allwindow handle>>> "+allwindow);
		for(String handleeach:allwindow)
		{
			driver.switchTo().window(handleeach);
		}
        System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        Thread.sleep(2000);
        System.out.println("New tab heading is: " + driver.findElement(By.xpath("//div[@class='content']/div")).getText());
        
        
        //after open third window
        
        driver.findElement(By.linkText("Open Another One!")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		allwindow=driver.getWindowHandles();
		System.out.println("allwindow handle>>> "+allwindow);
		for(String handleeach:allwindow)
		{
			driver.switchTo().window(handleeach);
		}
		System.out.println("Current window handle: " + driver.getWindowHandle());
        wait.until(ExpectedConditions.titleIs("Newtab2"));
        System.out.println("New Tab Title is: " + driver.getTitle());
        Thread.sleep(2000);
        System.out.println("New tab heading is: " + driver.findElement(By.xpath("//div[@class='content']/div")).getText());
  
        driver.quit();
        
        
    

	}

}
