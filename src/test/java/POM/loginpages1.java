package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpages1 extends BasePage {
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement buttonUsername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement buttonPassword;
	
	@FindBy(xpath="//button[@id='login-button']")
	private WebElement buttonLogin;
	
	public void enterUsername(String str)
	{
		buttonUsername.sendKeys(str);
	}
	public void enterPassword(String str)
	{
		buttonPassword.sendKeys(str);
	}
	public void PortalLogin()
	{
		buttonLogin.click();
	}
}
