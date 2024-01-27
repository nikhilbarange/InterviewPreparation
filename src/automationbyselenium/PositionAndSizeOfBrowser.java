package automationbyselenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class PositionAndSizeOfBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		Thread.sleep(4000);
		Dimension d = new Dimension(800, 300);
		driver.manage().window().setSize(d);
		Point p = new Point(800, 500);
		driver.manage().window().setPosition(p);
		
		
		
	}

}
