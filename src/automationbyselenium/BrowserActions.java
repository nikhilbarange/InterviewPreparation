package automationbyselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class BrowserActions {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3999);
//		driver.navigate().refresh();
//		Thread.sleep(4000);
//		driver.close();
	//	driver.quit();
		
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
