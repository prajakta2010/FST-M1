package selenium_activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acctivity8_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		Thread.sleep(5000);
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr"));
		System.out.println("Number of rows are >>"+rows.size());
		List<WebElement> cols=driver.findElements(By.xpath("//table[@class='ui celled striped table']//tbody/tr[1]/td"));
		System.out.println("Number of coloumns are >>"+cols.size());
		for(int i=1;i<=cols.size();i++)
		{
			System.out.println(driver.findElement(By.xpath("//table[@class='ui celled striped table']//tbody/tr[3]/td["+i+"]")).getText());
		}
		
		System.out.println(driver.findElement(By.xpath("//table[@class='ui celled striped table']//tbody/tr[2]/td[2]")).getText());
		driver.close();
	}

}
