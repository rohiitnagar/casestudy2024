package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	@FindBy(xpath ="//input[@id='text']")
	private WebElement user;
	
	@FindBy(xpath ="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//button[@id='login-button']")
	private WebElement button;
	
	public void getUser(String str) {
		user.sendKeys(str);
	}
	
	public void getPassword(String str) {
		password.sendKeys(str);
	}
	
	public void buttonClick() {
		button.click();
	}
	
}
