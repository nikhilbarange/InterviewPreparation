package automationbyselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert alert=driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		
		
	}

}
