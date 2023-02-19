package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is on login page step def");
	}

	@When("user gives user1 and pass1")
	public void user_gives_user1_and_pass1() {
		System.out.println("entered username and password");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("user logs in successfully")
	public void user_logs_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("user gives user2 and pass2")
	public void user_gives_user2_and_pass2() {
	    // Write code here that turns the phrase above into concrete actions
	}



}
