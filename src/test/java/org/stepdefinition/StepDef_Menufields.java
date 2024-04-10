package org.stepdefinition;

import org.base.ProjectSpecification;
import org.pages.HomePage;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Menufields extends ProjectSpecification{
	
	HomePage obj = new HomePage(driver);
	String orgTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
	
	@Given("user in the home page")
	public void user_in_the_home_page() {
	String pageTitle = obj.pageTitle();
	System.out.println(pageTitle);
	
	Assert.assertEquals(pageTitle, orgTitle);
	
	}

	@When("user clicks checkin button and get status")
	public void user_clicks_checkin_button_and_get_status() {
		 boolean attribute = obj.menufied().getCheckin().isDisplayed();
		 System.out.println("Whether the Checkin button is Pressent - "+attribute);
	}

	@Then("user clicks flightstatus button and get status")
	public void user_clicks_flightstatus_button_and_get_status() {
		
		 boolean attribute = obj.menufied().getFlightstatus().isDisplayed();
		 System.out.println("Whether the flightstatus button is Pressent - "+attribute);
	}

	@Then("user clicks manangebooking button and get status")
	public void user_clicks_manangebooking_button_and_get_status() {
		
		boolean attribute = obj.menufied().getManagebooking().isDisplayed();
		System.out.println("Whether the manangebooking button is Pressent - "+attribute);
	}

	@Then("user clicks flights button and get the response")
	public void user_clicks_flights_button_and_get_the_response() throws Exception {
		
		 boolean attribute = obj.menufied().getFlights().isDisplayed();
		 System.out.println("Whether the flights button is Pressent - "+attribute);
		 
		 obj.getScreenshot("menuoptions");
		 Thread.sleep(2000);
		 obj.closeBrowser();
		 
	}

	
}
