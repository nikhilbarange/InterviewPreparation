package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	
	@FindBy (xpath ="//input[@id='email']")private WebElement username;
	
	@FindBy (xpath ="//input[@id='pass']")private WebElement password;
	
	@FindBy (xpath ="//button[@name='login']")private WebElement login;
	
	@FindBy (xpath ="//a[text()='Forgotten password?']")private WebElement forgotpassword;
	
	@FindBy (xpath ="//a[@data-testid='open-registration-form-button']")private WebElement createNewAccount;
	
	public FaceBookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	public void clickOnForgotPassword() {
		forgotpassword.click();
	}
	
	public void clickOnCreateNewAccountButton() {
		createNewAccount.click();
	}

}
