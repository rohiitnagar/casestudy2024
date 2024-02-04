package Steps;

import POM.checkBoxPage;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class checkSteps {
	
	checkBoxPage c = new checkBoxPage();
	
	@Given("Open URL")
	public void open_url() {
		DriverUtils.getDriver().get("https://webdriveruniversity.com/");
	}

	@Then("Click on Link")
	public void click_on_link() {
	    c.open();
	}

	@Then("Select Java")
	public void select_java() {
	    c.java();
	}

	@Then("Select Eclipse")
	public void select_eclipse() {
	    c.eclipse();
	}

	@Then("Select HTML")
	public void select_html() {
	  c.html();
	}

	@Then("Select option")
	public void select_option() {
	    c.option1();
	}

	@Then("Select blue")
	public void select_blue() {
	   c.blue();
	}

	@Then("print")
	public void print() throws InterruptedException {
	   c.veg();
	}
}
