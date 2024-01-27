package automationbyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		//locators by id
//		WebElement username=driver.findElement(By.id("email"));
//		username.sendKeys("Nikhil");
		//Locator by name
//		WebElement password=driver.findElement(By.name("pass"));
//		password.sendKeys("12345");
		//Locator by tagname
//		WebElement login=driver.findElement(By.tagName("button"));
//		login.click();
		//Locator by className
//		WebElement forgot=driver.findElement(By.className("_6ltj"));
//		forgot.click();
		//Locator by cssSelector
//		WebElement username=driver.findElement(By.cssSelector("input[name='email']"));
//		username.sendKeys("Hello Nikhil");
		//Locator by linkedText
//		driver.findElement(By.linkText("Forgotten password?")).click();
		//Locator by partial Linked Text
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		
	}

}
