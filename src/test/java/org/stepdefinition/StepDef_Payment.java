package org.stepdefinition;

import org.base.ProjectSpecification;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class StepDef_Payment extends ProjectSpecification{
	HomePage obj = new HomePage(driver);

	@When("user handles offers alert")
	public void user_handles_offers_alert() {
	try {
		obj.acceptAllert();   
	}
	catch(Exception N){
		System.out.println("there is no allert ");
	}
	}

	@When("user enters debit card number")
	public void user_enters_debit_card_number() throws Exception {
		
		String cardnumber = obj.readFromProperty("cardnumber");
		obj.paymentpage().getCardnumber().sendKeys();
	}
	@When("user enters card holder name")
	public void user_enters_card_holder_name() throws Exception{
		String cardholdername = obj.readFromProperty("cardholdername");
		obj.paymentpage().getCardholdername().sendKeys(cardholdername);
	}
	
	
	@And("user enters debit card valid month and year")
	public void user_enters_debit_card_valid_date() throws Exception {
		
		String expmonth = obj.readFromProperty("expmonth");
		obj.paymentpage().getExpmonth().sendKeys(expmonth);
		
		String expyear = obj.readFromProperty("expyear");
		obj.paymentpage().getExpyear().sendKeys(expyear);
		
	}

	@And("user enters ccv number")
	public void user_enters_ccv_number() throws Exception {
		
		String cvvnum = obj.readFromProperty("cvvnum");
		obj.paymentpage().getCvvnumber().sendKeys(cvvnum);
	}

	@And("user clicks proceed to pay button")
	public void user_clicks_proceed_to_pay_button() throws Exception {
		obj.paymentpage().getProceedtopay().click();
		Thread.sleep(3000);
		
		obj.getScreenshot("onewaytrip");
	}
}
