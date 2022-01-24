package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps {
	
	WebDriver driver;
    WebDriverWait wait;
	
    @Given("^User is on Login page$")
    public void userIsOnLoginPage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @When("^User enters the username and password$")
    public void userEntersCrentials()
    {
    	driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }
    
    
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersCrentials(String uname,String pass)
    {
    	driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
    }
    
    @Then("^Read the page title and confirmation message$")
    public void readPageTitle()
    {
    	String PageTitle=driver.getTitle();
    	System.out.println("PageTitle >>  "+PageTitle);
    	String loginmessage=driver.findElement(By.id("action-confirmation")).getText();
    	System.out.println("Login Message >> "+loginmessage);
		
    }

    @And("^Close the login Browser$")
    public void CloseBrowser() {
       driver.close();
    } 
}
