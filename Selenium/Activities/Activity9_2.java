package selenium_activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		Thread.sleep(5000);
		WebElement dropdown=driver.findElement(By.id("multi-select"));
		Select select=new Select(dropdown);
		if(select.isMultiple())
		{
			select.selectByVisibleText("Javascript");
			Thread.sleep(2000);
			select.selectByValue("node");
			Thread.sleep(2000);
			select.selectByIndex(4);
			Thread.sleep(2000);
			select.selectByIndex(5);
			Thread.sleep(2000);
			select.selectByIndex(6);
			Thread.sleep(2000);
			select.deselectByValue("node");
			Thread.sleep(2000);
			select.deselectByIndex(7);
			Thread.sleep(2000);
			System.out.println("first selected option  "+select.getFirstSelectedOption().getText());
			List<WebElement> Allselectedoptions=select.getAllSelectedOptions();
			for(WebElement option:Allselectedoptions)
			{
				System.out.println("All seleted option>>>"+option.getText());
			}
			select.deselectAll();
		}
		driver.close();

	}

}
