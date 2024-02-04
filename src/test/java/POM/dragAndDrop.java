package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dragAndDrop extends BasePage{
	@FindBy(xpath="//h1[text()='ACTIONS']")
	private WebElement clickActions;
	
	@FindBy(xpath="//*[text()='Hover Over Me First!']")
	private WebElement clickHover1;
	
	@FindBy(xpath="//*[text()='Link 1']")
	private WebElement clickLink;
	
	public void ActionClick()
	{
		clickActions.click();
	}
	public void ActionHover()
	{
		clickHover1.click();
	}
	public void ActionLink()
	{
		clickLink.click();
	}
}
