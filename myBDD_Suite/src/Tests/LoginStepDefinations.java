package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinations {

	@Given("^A user is on ToolsQA login page")
	public void a_user_is_on_ToolsQA_login_page() throws Throwable {
	    System.out.println("We are in Given block");
	}

	@When("User clicks on MyAccount link")
public void user_in_MyAccntPage() {
	System.out.println("User in in MyAccnt page");
}

@Then("^User is able to login successfully")
	public void user_is_able_to_login_successfully() throws Throwable {
	   System.out.println("We are in Then block");
	}

}
