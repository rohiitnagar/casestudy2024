package POM;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utils.DriverUtils;

public class todoList extends BasePage{
	@FindBy(xpath = "//h1[normalize-space()='TO DO LIST']")
	private WebElement openTodoList;
	
	@FindBy(xpath= "//input[@placeholder='Add new todo']")
	private WebElement addToList;
	
	@FindBy(xpath = "//li[normalize-space()='Playing Cricket']//i[@class='fa fa-trash']")
	private WebElement delete1;
	
	@FindBy(xpath = "//li[normalize-space()='Watch Movie']//i[@class='fa fa-trash']")
	private WebElement delete2;
	
	@FindBy(xpath = "")
	private WebElement verify;
	
	public void openTodoList() {
		openTodoList.click();
		ArrayList<String> tab = new ArrayList<String>(DriverUtils.getDriver().getWindowHandles());
		DriverUtils.getDriver().switchTo().window(tab.get(1));
		
	}
	
	public void addToList(String str) {
		addToList.sendKeys(str);
		addToList.sendKeys(Keys.ENTER);
	}
	
	public void delete1() {
		delete1.click();
	}
	
	public void delete2() {
		delete2.click();
	}
	
	public void verify() throws InterruptedException {
List<WebElement> li = driver.findElements(By.xpath("//body"));
		
		Thread.sleep(2000);
		int count=li.size();
		 
		for(int i=0;i<count;i++)
		{
			Thread.sleep(2000);
		 
		WebElement element_verify=	 li.get(i);
		Thread.sleep(2000);
		 
		System.out.println(element_verify.getText());
		
	}
	}
}
