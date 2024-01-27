package seleniumwaits;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationbyselenium.LaunchBrowser;

public class ExplicitWait {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement username=driver.findElement(By.xpath("//input[@name='firstname']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(9000));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Nk");
		
	}

}
