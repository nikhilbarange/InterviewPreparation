package automationbyselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.openBrowser("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(60000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Nikhil");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Barange");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(""+123456789);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(1);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select se = new Select(month);
		se.selectByValue("12");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel = new Select(year);
		sel.selectByVisibleText("1994");
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		WebElement pronoun=driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		Select select = new Select(pronoun);
		select.selectByValue("6");
		driver.findElement(By.xpath("//input[@name='custom_gender']")).sendKeys("Male");
		
		
	}

}
