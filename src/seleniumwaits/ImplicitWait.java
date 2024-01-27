package seleniumwaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {
	
	public static WebDriver openBrowser() {
		ChromeOptions chrome = new ChromeOptions();
		chrome.setBrowserVersion("stable");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80000));
		return driver;
		
	}
	
	public static void main(String[] args) {
		WebDriver driver=openBrowser();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Nikhil");
	}

}
