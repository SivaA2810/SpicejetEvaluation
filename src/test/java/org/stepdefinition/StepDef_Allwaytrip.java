package org.stepdefinition;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Allwaytrip extends ProjectSpecification {

	HomePage obj = new HomePage(driver);

@Given("the user clicks the One-Way Trip checkbox")
public void the_user_clicks_the_one_way_trip_checkbox() {
   obj.oneway().getOnewaytripbtn().click();
}

@Given("the user clicks the Two-Way Trip checkbox")
public void userClicksTwoWayTripCheckbox() {
    obj.roundwaytrip().getRoundwaybutton().click();
}

@When("the user enters data for the From field")
public void the_user_enters_data_for_the_from_field() throws Exception {
	
	String chennai = obj.readFromProperty("chennai");
    obj.oneway().getFrom().sendKeys(chennai);
}

@When("the user enters data for the Destination field")
public void the_user_enters_data_for_the_destination_field() throws Exception {
	
	String delhi = obj.readFromProperty("delhi");
	obj.oneway().getDestination().sendKeys(delhi);
	
}

@When("the user selects a departure date and time")
public void the_user_selects_a_departure_date_and_time() {
	WebElement selectdate = obj.oneway().getSelectdate();
	clickusingJS(selectdate);
	WebElement departureDate = obj.oneway().getDepartureDate();
	waituntilelementtoclick(departureDate);
	departureDate.click();
	
}
@And("the user selects a return date and time")
public void userSelectsReturnDateTime() {
	obj.roundwaytrip().getSelectreturndate().click();
	WebElement returndate = obj.roundwaytrip().getReturndate();
	clickusingJS(returndate);
	
	
}

@When("the user enters passenger details")
public void the_user_enters_passenger_details() {
   
	WebElement pasangerdetails = obj.oneway().getPasangerdetails();
	waituntilelementtoclick(pasangerdetails);
	pasangerdetails.click();
	obj.oneway().getAddpasengerbtn().click();
//	obj.oneway().getAddpasengerbtn().click();
	obj.oneway().getAddchildbtn().click();
//	obj.oneway().getAddinfant().click();
	obj.oneway().getPasangerdetails().click();
	
	
	
}

@When("the user selects the desired currency type")
public void the_user_selects_the_desired_currency_type() {
    
}

@When("the user selects the Discount radio button")
public void the_user_selects_the_discount_radio_button() {
 // obj.oneway().getRadianbtn().click();
}

@When("the user clicks the Search Flights button")
public void the_user_clicks_the_search_flights_button() {
    obj.oneway().getSearchbtn().click();
}

@Then("the system should display relevant flight options for the given criteria")
public void the_system_should_display_relevant_flight_options_for_the_given_criteria() throws Exception {
   obj.getScreenshot("flightlist");
}


 
}

