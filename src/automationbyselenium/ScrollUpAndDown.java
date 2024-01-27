package automationbyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUpAndDown {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement toolbar=driver.findElement(By.xpath("(//span[text()='Toolbar'])[2]"));
	 // ((JavascriptExecutor)driver).executeScript("window.scrollBy(800,800)");
	  
	  //  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", toolbar);
		
		
		
	
		
	}

}
