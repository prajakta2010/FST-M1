package AppiumActivities;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2_1 {
	
	// Declare Android driver
		AndroidDriver<MobileElement> driver;
		WebDriverWait wait;

	
	@BeforeTest
	public void Setup() throws IOException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "pixelemulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.chrome");
		caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		wait=new WebDriverWait(driver,10);
		System.out.println("Chrome Opening");
		Activity2.takeScreenShot(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='NO THANKS']").click();

	}

	@Test
	public void verifyHeading() throws InterruptedException
	{
		driver.get("https://www.training-support.net/");
		wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.View[@text='About Us']")));
		String PageTitle =driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
		System.out.println("Title of home page is   "+PageTitle);
		Thread.sleep(5000);
		driver.findElementByXPath("//android.view.View[@text='About Us']").click();
		Thread.sleep(5000);
        String NewPageTitle =driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
		System.out.println("Title of New page is   "+NewPageTitle);
		Assert.assertEquals(PageTitle, "Training Support");
        Assert.assertEquals(NewPageTitle, "About Us");		
	}
	
	@AfterTest
	public void tearDown() {
		// Close app
		driver.quit();
	}


}
