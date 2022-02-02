package AppiumActivities;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity3 {

	
	// Declare Android driver
    AndroidDriver<MobileElement> driver;
 
    @BeforeTest
    public void Setup() throws MalformedURLException {
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
    }
    
    @Test
    public void Add()
    {
    	driver.findElementById("digit_5").click();
    	driver.findElementById("op_add").click();
    	 driver.findElementById("digit_9").click();
    	 driver.findElementById("eq").click();
    	  String result = driver.findElementById("result").getText();
          System.out.println(result);
          Assert.assertEquals(result, "14");
    }

    @Test
    public void Substract()
    {
    	driver.findElementById("digit_1").click();
    	driver.findElementById("digit_0").click();
    	driver.findElementById("op_sub").click();
    	 driver.findElementById("digit_5").click();
    	 driver.findElementById("eq").click();
    	  String result = driver.findElementById("result").getText();
          System.out.println(result);
          Assert.assertEquals(result, "5");
    }

    @Test
    public void Multiply()
    {
    	driver.findElementById("digit_5").click();
    	driver.findElementById("op_mul").click();
    	 driver.findElementById("digit_1").click();
    	 driver.findElementById("digit_0").click();
    	 driver.findElementById("digit_0").click();
    	 driver.findElementById("eq").click();
    	  String result = driver.findElementById("result").getText();
          System.out.println(result);
          Assert.assertEquals(result, "500");
    }
    
    
    @Test
    public void Divide()
    {
    	driver.findElementById("digit_5").click();
    	 driver.findElementById("digit_0").click();
    	driver.findElementById("op_div").click();
    	 driver.findElementById("digit_2").click();
    	 driver.findElementById("eq").click();
    	  String result = driver.findElementById("result").getText();
          System.out.println(result);
          Assert.assertEquals(result, "25");
    }
	@AfterTest
	public void tearDown() {
		// Close app
		driver.quit();
	}


}
