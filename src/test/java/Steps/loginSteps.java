package Steps;

import org.openqa.selenium.Alert;

import POM.LoginPage;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	LoginPage lp = new LoginPage();
	
//	@Given("Opening URL")
//	public void opening_url() {
//	   DriverUtils.getDriver().get("https://webdriveruniversity.com/Login-Portal/index.html");
//	}
//
//	@Then("Enter Username")
//	public void enter_username() {
//	    lp.getUser("ROhit");
//	}
//
//	@Then("Enter Password")
//	public void enter_password() {
//	    lp.getPassword("Rohit");
//	}
//
//	@Then("Click Login")
//	public void click_login() {
//	 lp.buttonClick();
//	}
	@Given("Opening URL")
	public void opening_url() {
	    DriverUtils.getDriver().get("https://webdriveruniversity.com/Login-Portal/index.html");
	}

	@When("Enter Username <{string}> And Enter Password <{string}>")
	public void enter_username_and_enter_password(String string, String string2) {
	   lp.getUser(string);
	   lp.getPassword(string2);
	}

	@Then("Click Login")
	public void click_login() {
	    lp.buttonClick();
	}
	
	@Then("Click Alert")
	public void click_alert() throws InterruptedException {
	    Alert a = DriverUtils.getDriver().switchTo().alert();
	    a.accept();
	    Thread.sleep(2000);
	}

	@When("enter username1 {string} and Password1 {string}")
	public void enter_username1_and_password1(String string, String string2) {
	    lp.getUser(string);
	    lp.getPassword(string2);
	}
	
	@Then("Click on login")
	public void click_on_login() {
	lp.buttonClick();
	}
    
	@Then("Clicking Alert")
	public void clicking_alert() throws InterruptedException {
		 Alert a = DriverUtils.getDriver().switchTo().alert();
		    a.accept();
		    Thread.sleep(2000);
	}
	



}
