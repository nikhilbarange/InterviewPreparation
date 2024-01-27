package automationbyselenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TakingScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.myntra.com");
		ScreenShot.takeScreenShot(driver, "republic_day");
	}

}
