package Steps;

import POM.todoList;
import Utils.DriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class todoSteps {
	
	todoList t = new todoList();
	@Given("Open the URL")
	public void open_the_url() {
		DriverUtils.getDriver().get("https://webdriveruniversity.com/");
	}

	@Then("Click todo List")
	public void click_todo_list() {
	   t.openTodoList();
	}

	@When("addItem <item>")
	public void add_item_item() {
	   t.addToList("Watch Movie");
	}

	@Then("clickEnter Button")
	public void click_enter_button() {
		
	}

	@When("addItem <item1>")
	public void add_item_item1() {
	   t.addToList("Playing Cricket");
	}

	@Then("click deleteOne Button")
	public void click_delete_one_button() {
	   t.delete1();
	}

	@Then("click deleteTwo Button")
	public void click_delete_two_button() {
	    t.delete2();
	}
	
	@Then("verify")
	public void verify() throws InterruptedException {
	   t.verify();
	}

}
