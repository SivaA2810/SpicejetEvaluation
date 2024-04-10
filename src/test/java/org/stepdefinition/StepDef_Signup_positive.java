package org.stepdefinition;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_Signup_positive extends ProjectSpecification{

	HomePage obj = new HomePage(driver);

	
    @Given("the user clicks the signup button")
    public void the_user_clicks_the_signup_button() throws Exception {
    	
    	obj.signup().getSignupbtn().click();
    }

    @When("the user selects title")
    public void the_user_selects_title() {
    
    	obj.SwitchChildwindow();
    	
    	WebElement title = obj.signup().getTitle(); 
		obj.dropdown(title, 1);
    }

    @And("the user enters a valid first name")
    public void the_user_enters_a_valid_first_name() throws Exception {
    	
    	String firstname = obj.readFromProperty("firstname");
    	obj.signup().getFirstname().sendKeys(firstname);	
    }

    @And("the user enters a valid last name")
    public void the_user_enters_a_valid_last_name() throws Exception {
    	
    	String lastname = obj.readFromProperty("lastname");
    	obj.signup().getLastname().sendKeys(lastname); 
    }

    @And("the user selects their country")
    public void the_user_selects_their_country() {
      
    	WebElement country = obj.signup().getCountry();
    	dropdown(country, 101);
    }

    @And("the user enters their date of birth")
    public void the_user_enters_their_date_of_birth() throws Exception {
    	
    	WebElement clickdatepick = obj.signup().getClickdatepick();
    	waituntilelementtoclick(clickdatepick);
    	clickdatepick.click();
    	
    	WebElement yearpicker = obj.signup().getYearpicker();
    	obj.waituntilelementtoclick(yearpicker);
    	obj.selectbyvaluedropdown(yearpicker, "1993");
    	
    	WebElement monthpicker = obj.signup().getMonthpicker();
    	obj.waituntilelementtoclick(monthpicker);
    	obj.dropdownByindex(monthpicker,10);
    	
    	
    	WebElement datepick = obj.signup().getDatepick();
    	obj.waituntilelementtoclick(datepick);
    	datepick.click();
    	
//    	String dob = obj.readFromProperty("Dob");
//    	WebElement dateofbirth = obj.signup().getDob();
//    	positionigelement(dateofbirth);
//    	dateofbirth.sendKeys(dob);
//    	dateofbirth.click();
    }

    @And("the user enters their phone number")
    public void the_user_enters_their_phone_number() throws Exception {
        
    	String phno=obj.readFromProperty("phno");
    	obj.signup().getPhno().sendKeys(phno);   
    }

    @And("the user enters their email address")
    public void the_user_enters_their_email_address() throws Exception {
    	
    	String email=obj.readFromProperty("email");
    	WebElement enteremail = obj.signup().getEmail();
    	waituntilelementtoclick(enteremail);
    	enteremail.sendKeys(email);
    	
    }
    
    //@negative
    @Then("the user enters invalid {string}")
    public void the_user_enters_invalid(String email) {
    	obj.signup().getEmail().sendKeys(email);
    	
    }
    
    @And("the user enters a valid password")
    public void the_user_enters_a_valid_password() throws Exception {
        
    	String password=obj.readFromProperty("password");
    	obj.signup().getPassword().sendKeys(password);
    }
    
    //@negative
    @Then("user enters invalid {string}")
    public void user_enters_invalid(String password) {
    	obj.signup().getPassword().sendKeys(password);
	
    }

    @And("the user confirms the password")
    public void the_user_confirms_the_password() throws Exception {
    	
    	String confirmpassword=obj.readFromProperty("password");
    	obj.signup().getConfirmpassword().sendKeys(confirmpassword);
    	
    	
    }

    @And("the user agrees to terms and conditions")
    public void the_user_agrees_to_terms_and_conditions() {
      
    	WebElement agreebtn = obj.signup().getAgreebtn();
    	waituntilelementtoclick(agreebtn);
    	agreebtn.click();
    }

    @And("the user clicks the submit button")
    public void the_user_clicks_the_submit_button() {
       
    	WebElement submitbtn = obj.signup().getSubmitbtn();
    	waituntilelementtoclick(submitbtn);
    	submitbtn.click();
    	
    	
    	
    }
    
    
}
