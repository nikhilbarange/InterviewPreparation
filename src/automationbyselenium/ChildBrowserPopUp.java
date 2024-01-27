package automationbyselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;

public class ChildBrowserPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.naukri.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@title='Remote']")).click();
		driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		while(i.hasNext()) {
			String handle=i.next();
			driver.switchTo().window(handle);
			Thread.sleep(2000);
			String currentTitle=driver.getTitle();
			if(currentTitle.contains("Mnc Job Vacancies")) {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//a[@title='Analyst SMRT']")).click();
				break;
			}
			
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
