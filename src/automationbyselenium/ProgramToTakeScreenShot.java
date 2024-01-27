package automationbyselenium;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class ProgramToTakeScreenShot {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		ScreenShot.takeScreenShot(driver, "Nikhil's Screenshot");
		
	}

}
