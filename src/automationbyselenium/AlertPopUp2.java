package automationbyselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUp2 {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.openBrowser("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("nikhil");
		alert.accept();
	}

}
