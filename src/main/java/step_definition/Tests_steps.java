package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tests_steps {
	
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.out.println("user is on home page");
	   
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
	    System.out.println("User Navigate to LogIn Page");
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
	    System.out.println("User enters UserName and Password");
	}

	@Then("message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		System.out.println("message displayed Login Successfully");
	   
	}

	@When("user Logout from the Application")
	public void user_Logout_from_the_Application() {
		System.out.println("user Logout from the Application");
	   
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		System.out.println("Message displayed Logout Successfully");
	    
	}
}




