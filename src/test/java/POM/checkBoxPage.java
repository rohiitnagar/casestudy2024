package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.DriverUtils;

public class checkBoxPage extends BasePage {
	@FindBy(xpath= "//h1[normalize-space()='DROPDOWN, CHECKBOXE(S) & RADIO BUTTON(S)']")
	private WebElement openPage;
	
	@FindBy(xpath= "//select[@id='dropdowm-menu-1']/option[1]")
	private WebElement java;
	
	@FindBy(xpath= "//select[@id='dropdowm-menu-2']/option[1]")
	private WebElement eclipse;
	
	@FindBy(xpath= "//select[@id='dropdowm-menu-3']/option[1]")
	private WebElement html;
	
	@FindBy(xpath= "//input[@value='option-1']")
	private WebElement option1;
	
	@FindBy(xpath= "//input[@value='blue']")
	private WebElement blue;
	
	@FindBy(xpath= "//body/div[@class='container']/div[5]/div[1]/div[1]")
	private WebElement veg;
	
	public void open() {
		openPage.click();
		ArrayList<String> tab = new ArrayList<String>(DriverUtils.getDriver().getWindowHandles());
		DriverUtils.getDriver().switchTo().window(tab.get(1));
	}
	
	public void java() {
		java.click();
	}
	
	public void eclipse() {
		eclipse.click();
	}
	
	public void html() {	
		html.click();
	}
	
	public void option1() {
		option1.click();
	}
	
	public void blue() {
		blue.click();
	}
	
	public void veg() throws InterruptedException {
		
List<WebElement> li1 = driver.findElements(By.xpath("//form[@id='radio-buttons-selected-disabled']"));
		
		Thread.sleep(2000);
		int count=li1.size();
		 
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
		 
		WebElement element_verify=	 li1.get(i);
		Thread.sleep(2000);
		 
		System.out.println(element_verify.getText());
		

		}}}

