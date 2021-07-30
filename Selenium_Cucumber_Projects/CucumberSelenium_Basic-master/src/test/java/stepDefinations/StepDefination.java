package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("^User is on Landing Page$")
    public void user_is_on_landing_page()  {
        System.out.println("User is on Landing Page0000000000");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("User login into application with username and password000000000000");
    }

    @Then("^Home page is Displayed$")
    public void home_page_is_displayed()  {
       System.out.println("Home page is Displayed0000000000000");
    }

    @And("^Dashboard is Displayed$")
    public void dashboard_is_displayed()  {
       System.out.println("Dashboard is Displayed0000000000000");
    }
    
    @When("User login into application with username {string} and password {string}")
    public void user_login_into_application_with_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println(string);
    	System.out.println(string2);
    }
	
}
