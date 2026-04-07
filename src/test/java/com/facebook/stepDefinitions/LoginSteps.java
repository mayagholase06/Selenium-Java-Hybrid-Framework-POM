package com.facebook.stepDefinitions;

import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends MasterPage {
    // using constructor method
	public LoginSteps() throws Exception {
		super();
		log.info(">>>> Starting Facebook Login Test Execution <<<<");
		
	}
	LoginPage lp;

    //  'Given' Step
    @Given("User is on the Facebook login page")
    public void user_is_on_the_facebook_login_page() throws Exception {
        // masterpage code to open browser
        lp = new LoginPage();
        log.info("LoginPage object created and browser launched.");
    }

    //  'When' Step
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        lp.enterUsername();
        log.info("Step: Username entered successfully.");
        lp.enterPassword();
        log.info("Step: Password entered successfully.");
    }

    // 'And' Step
    @And("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
    	log.info("Clicking on Login Button...");
        lp.clickLoginButton();
        log.info("Step: Login button clicked, and navigating to home page.");
    }

    // 'Then' Step
    @Then("User should see the home page")
    public void user_should_see_the_home_page() {
    	log.info(">>>> Facebook Login Test Completed Successfully <<<<");
        System.out.println("Cucumber Step: Login attempt completed!");
        
    }
}


