package keyboardaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import automationbyselenium.LaunchBrowser;

public class ContextClick {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick);
		actions.perform();
	}
	
	

}
