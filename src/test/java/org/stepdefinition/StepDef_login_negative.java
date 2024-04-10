package org.stepdefinition;

import org.base.ProjectSpecification;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io. cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_login_negative extends ProjectSpecification{
	 HomePage obj = new HomePage(driver);
	    @Given("user clicks on the login button")
	    public void user_clicks_on_the_login_button() {
	       obj.login().getLoginBtn().click();
	    }

	    @When("user tries to login with invalid credentials {string} {string}")
	    public void user_tries_to_login_with_invalid_credentials(String mobileNo, String password) {
	    	
	    	obj.login().getUsermobileno().sendKeys(mobileNo);
	    	obj.login().getUserpassword().sendKeys(password);
	    }

	    @And("user clicks the submit button")
	    public void user_clicks_the_submit_button() {
	    	
	    	obj.login().getSubmitbtn().click();
	    	
	    }

	    @Then("a screenshot is taken")
	    public void a_screenshot_is_taken() throws Exception  {
	      obj.getScreenshot("screenshot");
	    }

	    
	  
	    
	}
