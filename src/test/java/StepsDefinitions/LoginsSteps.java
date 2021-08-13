package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginsSteps {
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    System.out.println("inside Step: Given: user is in login page");
	}

	@And("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside Step: When: user enters username and password\"");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside Step: And: clicks on login button");
	}

	@Then("user is navigated to  the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside Step: Then: user is navigated to  the home page");
	}


}
