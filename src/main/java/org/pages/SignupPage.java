package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends ProjectSpecification{

	public SignupPage(WebDriver driver) {
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[text()='Signup']")
	private WebElement signupbtn;
	
	@CacheLookup
	@FindBy(xpath="//select[@class='form-control form-select ']")
	private WebElement title;
	
	@CacheLookup
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@CacheLookup
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@CacheLookup
	@FindBy(xpath="//select[@class='form-control form-select']")
	private WebElement country;
	
	@CacheLookup
	@FindBy(id="dobDate")
	private WebElement dob;
	
	@CacheLookup
	@FindBy(xpath="//input[@class=' form-control']")
	private WebElement phno;
	
	@CacheLookup
	@FindBy(xpath="//input[@id='email_id']")
	private WebElement email;
	
	@CacheLookup
	@FindBy(id="new-password")
	private WebElement password;
	
	@CacheLookup
	@FindBy(id="c-password")
	private WebElement confirmpassword;
	
	@CacheLookup
	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	private WebElement agreebtn;
	
	
	@FindBy(id="dobDate")
	private WebElement clickdatepick;
	
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement monthpicker;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement yearpicker;
	
	@FindBy(xpath="//div[@class='react-datepicker__month-container']//div[@class='react-datepicker__week']//div[text()='19']")
	private WebElement datepick;
	
	@CacheLookup
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbtn  ;

	
	public WebElement getSignupbtn() {
		return signupbtn;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getAgreebtn() {
		return agreebtn;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
	public WebElement getClickdatepick() {
		return clickdatepick;
	}
	public WebElement getMonthpicker() {
		return monthpicker;
	}
	public WebElement getYearpicker() {
		return yearpicker;
	}
	public WebElement getDatepick() {
		return datepick;
	}
	
	
	
	
	
}
