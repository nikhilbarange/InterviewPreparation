package automationbyselenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =LaunchBrowser.openBrowser("https://www.facebook.com");
		//Xpath by attributes
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Nikhil BArange");
		//Xpath by text
	//	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		//Xpath by contains
	//	driver.findElement(By.xpath("//button[contains(@data-testid,royal_login)]")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Thread.sleep(3000);
		
		
		
		
	}
	
	
}
