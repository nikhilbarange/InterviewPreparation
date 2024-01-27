package automationbyselenium;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataCallingFromExcelSheet {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	    WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
	    String username=Parametrization.getStringCellValue("nik", 0, 0);
	   String password= Parametrization.getStringCellValue("nik", 1, 0);
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	    
	    
	}
	
	

}
