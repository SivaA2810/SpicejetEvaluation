package org.stepdefinition;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Pasangerdetails extends ProjectSpecification {
	
	HomePage obj = new HomePage(driver);
	
	 @Given("the user is on the flight booking page")
	    public void userIsOnFlightBookingPage() {
	        String pageTitle = obj.pageTitle();
	        System.out.println(pageTitle);
	        
	    }

	    @When("the user clicks the Continue button")
	    public void userClicksContinueButton() {
	        
	    	obj.flightpassanger().getContinuebtn().click();
	    }

	    @Then("the user should be redirected to the passenger details page")
	    public void userRedirectedToPassengerDetailsPage() {
	     
	      
	    }

	    @When("the user selects the title for the contact person")
	    public void userSelectsTitleForContactPerson() {
	    	
//	    	WebElement title = obj.flightpassanger().getTitle();
//		    obj.dropdownByindex(title, 1);

	    	
	    }

	    @When("enters the contact details {string} {string} {string} {string}")
	    public void userEntersContactDetails(String firstName, String lastName, String phoneNumber, String emailAddress) {
	    	
	    	obj.flightpassanger().getFirstname().sendKeys(firstName);
	    	obj.flightpassanger().getLastname().sendKeys(lastName);
	    	obj.flightpassanger().getPhno().sendKeys(phoneNumber);
	    	obj.flightpassanger().getEmail().sendKeys(emailAddress);
	    	
	    }

	    @When("selects the country and enters the city")
	    public void userSelectsCountryAndEntersCity() throws Exception {
	     	String fromProperty = obj.readFromProperty("owntown");
	     	obj.flightpassanger().getCity().sendKeys(fromProperty);
	     	
	    }

	    @When("adds passenger details for each traveler")
	    public void userAddsPassengerDetails() {
	    	
	    
	    }
	    
	    @When("user enters first passanger details  {string} {string} {string} {string}")
	    public void user_enters_first_passanger_details(String fpFirstName, String fpLastName, String fpPhoneNumber, String fpEmailAddress) {
	    	 WebElement pasanger1firstname = obj.flightpassanger().getPasanger1firstname();
	 	    positionigelement(pasanger1firstname);
	 	    pasanger1firstname.sendKeys(fpFirstName);
	 	    WebElement pasanger1lastname = obj.flightpassanger().getPasanger1lastname(); 
	 	    positionigelement(pasanger1lastname); 
	 	    pasanger1lastname.sendKeys(fpLastName);
	 	    obj.flightpassanger().getPasanger2phno().sendKeys(fpPhoneNumber);
	 	    obj.flightpassanger().getNextbtn().click(); 
	    }
	    
	    @When("user enters second passanger details {string} {string} {string}")
	    public void user_enters_second_passanger_details(String spfirstname, String splastname, String spphno) throws Exception {
	   
	    WebElement pasanger2firstname = obj.flightpassanger().getPasanger1firstname();
	    positionigelement(pasanger2firstname);
	    pasanger2firstname.sendKeys(spfirstname);
	    obj.flightpassanger().getPasanger1lastname().sendKeys(splastname);
	    obj.flightpassanger().getPasanger2phno().sendKeys(spphno);
	    obj.flightpassanger().getNextbtn().click();
	    
	    }
	    @When("user enters third passanger details {string} {string} {string}")
	    public void user_enters_third_passanger_details(String tpFirstName, String tpLastName, String tpPhoneNumber) {
	    	
	    	obj.flightpassanger().getTitle().click();
	    	obj.flightpassanger().getMasterbtn().click();
	    	WebElement pasanger3firstname = obj.flightpassanger().getPasanger1firstname();
		    positionigelement(pasanger3firstname);
		    pasanger3firstname.sendKeys(tpFirstName);
		    obj.flightpassanger().getPasanger1lastname().sendKeys(tpLastName);
//		    obj.flightpassanger().getPasanger2phno().sendKeys(tpPhoneNumber);
	    }

	    @When("user clicks contine button")
	    public void user_clicks_contine_button() throws Exception {
	    obj.flightpassanger().getFinalcontinuebtn().click();
	    Thread.sleep(7000);
	    obj.scrolldown();
	    
	 
	    WebElement addoncontinuebtn = obj.flightpassanger().getAddoncontinuebtn();
	    waituntilelementtoclick(addoncontinuebtn);
	    positionigelement(addoncontinuebtn); 
	    clickusingJS(addoncontinuebtn);
	    
	    }
	    
	    
	    }
