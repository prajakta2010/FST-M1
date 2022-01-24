package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertSteps {
	
	WebDriver driver;
    WebDriverWait wait;
    Alert alert;
    
	@Given("^User is on Alert page$")
	public void onAlertPage()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}

	
	@When("^User clicks the Simple Alert button$")
	public void SimpleAlert() throws InterruptedException
	{
		WebElement simplealert=driver.findElement(By.id("simple"));
		simplealert.click();
		Thread.sleep(5000);
	} 
	
	@When("^User clicks the Confirm Alert button$")
	public void ConfirmAlert() throws InterruptedException
	{
		WebElement confirmalert=driver.findElement(By.id("confirm"));
		confirmalert.click();
		Thread.sleep(5000);
	}  
	
	@When("^User clicks the Prompt Alert button$")
	public void PromptAlert() throws InterruptedException
	{
		WebElement prompt=driver.findElement(By.id("prompt"));
		prompt.click();
		Thread.sleep(5000);
	} 
	
	@Then("^Alert opens$")
	public void SwitchToAlert()
	{
		alert=driver.switchTo().alert();
	}
	
	
	@And("^Read the text from it and print it$")
	public void readAlert()
	{
		System.out.println("Alert text>>  "+alert.getText());
	}
	
	
	@And("^Close the alert$")
	public void closeAlert()
	{
		alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void cancelAlert()
	{
		alert.dismiss();
	}
	
	@And("^Write a custom message in it$")
	public void sendMessage() throws InterruptedException
	{
		alert.sendKeys("Custom Message");
		Thread.sleep(5000);
	}
	
	@And("^Close the Browser$")
	public void closeBrowser()
	{
		driver.close();
	}
}
