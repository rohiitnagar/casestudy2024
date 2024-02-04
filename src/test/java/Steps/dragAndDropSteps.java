package Steps;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import POM.dragAndDrop;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class dragAndDropSteps {
dragAndDrop dp = new dragAndDrop();
	
	@Given("Open the drop URL")
	public void open_the_url() {
	    DriverUtils.getDriver().get("https://webdriveruniversity.com/");
	}

	@Then("Click on Actions Page")
	public void click_on_actions_page() throws InterruptedException {
	    Thread.sleep(2000);
	    JavascriptExecutor j=(JavascriptExecutor)DriverUtils.getDriver();
        Thread.sleep(2000);
        
        String Scrolldown = "window.scrollBy(0,2500)";
        j.executeScript(Scrolldown);
        Thread.sleep(2000);
	    dp.ActionClick();
	    Thread.sleep(2000);
	    ArrayList<String> newTb = new ArrayList<String>(DriverUtils.getDriver().getWindowHandles());
		DriverUtils.getDriver().switchTo().window(newTb.get(1));
	}
	
	@Then("Click on Drag")
	public void click_on_drag() throws InterruptedException {
		WebElement element = DriverUtils.getDriver().findElement(By.xpath("//*[text()='DRAG ME TO MY TARGET!']"));
        WebElement element1 = DriverUtils.getDriver().findElement(By.xpath("//*[text()='DROP HERE!']"));
        Actions act = new Actions(DriverUtils.getDriver());
        Thread.sleep(2000);
       
        act.dragAndDrop(element, element1).perform();
       
        
	}
	@Then("Click on double Click")
	public void click_on_double_click() {
	    WebElement e3 = DriverUtils.getDriver().findElement(By.xpath("//*[text()='Double Click Me!']"));
	    Actions act = new Actions(DriverUtils.getDriver());
	       
        act.doubleClick(e3).perform();
	}
	@Then("Click on Hover me first")
	public void click_on_hover_me_first() throws InterruptedException {
	    Thread.sleep(2000);
	    dp.ActionHover();
	    Thread.sleep(2000);
	    dp.ActionLink();
	    Alert a = DriverUtils.getDriver().switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.accept();
	}
	@Then("Click on Hold")
	public void click_on_hold() throws InterruptedException {
	    WebElement e4 = DriverUtils.getDriver().findElement(By.xpath("//*[text()='Click and Hold!']"));
	    Actions act1 = new Actions(DriverUtils.getDriver());
	    Thread.sleep(2000);
	    
	    act1.clickAndHold(e4).perform();
	}
}
