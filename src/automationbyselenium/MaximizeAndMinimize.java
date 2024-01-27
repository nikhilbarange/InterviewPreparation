package automationbyselenium;

import org.openqa.selenium.WebDriver;

public class MaximizeAndMinimize {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(4999);
		driver.close();
		
		
		
	}

}
