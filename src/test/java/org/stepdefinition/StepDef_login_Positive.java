package org.stepdefinition;

import org.base.ProjectSpecification;
import org.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDef_login_Positive extends ProjectSpecification {
	
		HomePage obj = new HomePage(driver);

	    @Given("the user is on the login page")
	    public void the_user_is_on_the_login_page() {
	      
	    	obj.login().getLoginBtn().click(); 
	    }

	    @When("the user enters valid credentials")
	    public void the_user_enters_valid_credentials() {
	       
	    	obj.login().getUsermobileno().sendKeys("8015648363");
	        obj.login().getUserpassword().sendKeys("Adse9566@");
	    }

	    @When("clicks the submit button")
	    public void the_user_clicks_the_login_button() {
	    	 
	    	obj.login().getSubmitbtn().click();
	    }

	    @Then("takes screenshot when is passed")
	    public void takes_screenshot_when_is_passed() throws Exception {
	    	
	    	obj.getScreenshot("positive");
	}

	   
	    
	    
}
