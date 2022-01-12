package automationframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		Thread.sleep(10000);
		String title=driver.getTitle();
		System.out.println("Title is >>"+title);
		driver.close();

	}

}
