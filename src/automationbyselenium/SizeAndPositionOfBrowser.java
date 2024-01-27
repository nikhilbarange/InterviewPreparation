package automationbyselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class SizeAndPositionOfBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		Thread.sleep(4000);
		Dimension d = new Dimension(400, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		Point p = new Point(400, 700);
		driver.manage().window().setPosition(p);
		String currentTitle=driver.getTitle();
		System.out.println(currentTitle);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
	}

}
