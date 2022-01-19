package selenium_activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-select']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("Option 2");
		Thread.sleep(2000);
		select.selectByIndex(3);
		Thread.sleep(2000);
		select.selectByValue("4");
		Thread.sleep(2000);
		List<WebElement> ALLoptions=select.getOptions();
		for(WebElement option:ALLoptions )
		{
			System.out.println("Option :"+option.getText());
		}
		driver.close();
	}

}
