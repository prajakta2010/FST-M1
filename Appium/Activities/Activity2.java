package AppiumActivities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity2 {


	// Declare Android driver
	AndroidDriver<MobileElement> driver;

	@BeforeTest
	public void Setup() throws IOException {
		// Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "pixelemulator");
		caps.setCapability("platformName", "Android");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("appPackage", "com.android.calculator2");
		caps.setCapability("appActivity", ".Calculator");
		caps.setCapability("noReset", true);

		// Instantiate Appium Driver
		URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(appServer, caps);
		System.out.println("Calculator is open");
		Activity2.takeScreenShot(driver);

	}


	@Test(priority=1)
	public void Multipy() throws IOException {
		// Using resource-id
		driver.findElementById("digit_5").click();
		Activity2.takeScreenShot(driver);
		// Using Accessibility ID
		driver.findElementByAccessibilityId("multiply").click();
		// Using XPath
		driver.findElementByXPath("//android.widget.Button[@text='9']").click();
		Activity2.takeScreenShot(driver);
		// Perform Calculation
		driver.findElementById("eq").click();
		Activity2.takeScreenShot(driver);
		// Display Result
		String result = driver.findElement(MobileBy.id("result")).getText();
		System.out.println(result);

		// Assertion
		Assert.assertEquals(result, "45");
	}


	@AfterTest
	public void tearDown() {
		// Close app
		driver.quit();
	}


	public static void takeScreenShot( AndroidDriver<MobileElement> driver) throws IOException
	{
		// Take screenshot
		File scrShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenShotName =  new SimpleDateFormat("yyyyMMddhhmmss'_ScrShot.jpg'").format(new Date());
		File dest = new File("src/test/resources/"+ screenShotName);
		FileUtils.copyFile(scrShot, dest);
		String filePath=dest.getAbsolutePath();
		// Set image HTML in the report
		String path = "<img src='" + filePath + "'/>";
		// Show image in report
		Reporter.log(path);

	}

}
