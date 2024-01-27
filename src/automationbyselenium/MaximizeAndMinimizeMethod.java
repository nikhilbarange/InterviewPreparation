package automationbyselenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

public class MaximizeAndMinimizeMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
