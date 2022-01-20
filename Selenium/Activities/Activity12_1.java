package selenium_activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		WebElement frame1=driver.findElement(By.xpath("//iframe[@src='/selenium/frame1']"));
		driver.switchTo().frame(frame1);
		WebElement first_heading=driver.findElement(By.xpath("//div[@class='content']"));
		WebElement first_button=driver.findElement(By.xpath("//button[@id='actionButton']"));
		System.out.println("Heading of first frame>>>"+first_heading.getText());
		System.out.println("Text on the button>>>"+first_button.getText());
		System.out.println("Color on the button>>>"+first_button.getCssValue("background-color"));
		first_button.click();
		Thread.sleep(5000);
		System.out.println("Text on the button>>>"+first_button.getText());
		System.out.println("Color on the button>>>"+first_button.getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.xpath("//iframe[@src='/selenium/frame2']"));
		driver.switchTo().frame(frame2);
		WebElement second_heading=driver.findElement(By.xpath("//div[@class='content']"));
		WebElement second_button=driver.findElement(By.xpath("//button[@id='actionButton']"));
		System.out.println("Heading of second frame>>>"+second_heading.getText());
		System.out.println("Text on the button>>>"+second_button.getText());
		System.out.println("Color on the button>>>"+second_button.getCssValue("background-color"));
		second_button.click();
		Thread.sleep(5000);
		System.out.println("Text on the button>>>"+second_button.getText());
		System.out.println("Color on the button>>>"+second_button.getCssValue("background-color"));
		driver.close();
		
		
	}

}
