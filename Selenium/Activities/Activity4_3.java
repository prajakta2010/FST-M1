package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		WebElement third_header=driver.findElement(By.xpath("//h3[@id='third-header']"));
		System.out.println("Third Header >> "+third_header.getText());
		WebElement fifth_header=driver.findElement(By.xpath("//h5[@class='ui green header']"));
		System.out.println("Fifth Header >> "+fifth_header.getText());
		String cssValue = fifth_header.getCssValue("color");
		System.out.println("Color of Fifth header>> "+cssValue);
		WebElement violet_button=driver.findElement(By.xpath("//button[text()='Violet']"));
		System.out.println("All the class attribute values are >>"+violet_button.getAttribute("class"));
		WebElement grey_button=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]"));
		System.out.println("Grey button text>> "+grey_button.getText());
		driver.close();

	}

}
