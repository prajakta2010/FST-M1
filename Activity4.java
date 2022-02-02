package AppiumActivities;

import java.net.MalformedURLException;
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

public class Activity4 {

	// Declare Android driver
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeTest
    public void Setup() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "pixelemulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);
 
        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
        wait=new WebDriverWait(driver,10);
        System.out.println("Contact is open");
    }
    
    @Test
    public void AddContacts() throws InterruptedException
    {
    	driver.findElementById("floating_action_button").click();
    	Thread.sleep(5000);
    	driver.findElementByXPath("//android.widget.EditText[@text='First name']").sendKeys("Aaditya");
    	driver.findElementByXPath("//android.widget.EditText[@text='Last name']").sendKeys("Varma");
    	driver.findElementByXPath("//android.widget.EditText[@text='Phone']").sendKeys("999148292");
    	driver.findElementById("editor_menu_save_button").click();
    	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(MobileBy.id("toolbar")));
    	MobileElement ele=driver.findElementById("toolbar");
    	Assert.assertTrue(ele.isDisplayed());
    	Thread.sleep(5000);
    	String contactName=driver.findElementById("large_title").getText();
       Assert.assertEquals(contactName,"Aaditya Varma");
    	
    }
    
    
    @AfterTest
	public void tearDown() {
		// Close app
		driver.quit();
	}


}
