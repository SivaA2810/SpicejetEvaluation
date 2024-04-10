package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;

public class HomePage extends ProjectSpecification{

	public HomePage(WebDriver driver) {
	this.driver=driver;
		
	}
	public LoginPage login() {
	return new LoginPage(driver);
	}
	public SignupPage signup() {
	return new SignupPage(driver);
	}
	public OnewayTrip oneway() {
	return new OnewayTrip(driver);
	}
	
	public Flights_Pasangers flightpassanger() {
	return new 	Flights_Pasangers(driver);
	}
	
	public PaymentPage paymentpage() {
	return new PaymentPage(driver);
	}
	
	public Roundwaytrip roundwaytrip() {
	return new Roundwaytrip(driver);
	}
	
	public UpperMenu menufied() {
	return new UpperMenu(driver);
	}
	
}
