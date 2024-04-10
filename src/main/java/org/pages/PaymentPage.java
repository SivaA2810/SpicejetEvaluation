package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends ProjectSpecification {

	public PaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="card_number")
	private WebElement cardnumber;
	
	@FindBy(id="name_on_card")
	private WebElement cardholdername;
	
	
	@FindBy(id="card_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="card_exp_year")
	private WebElement expyear ;
	
	@FindBy(id="security_code")
	private WebElement cvvnumber;
	
	
	@FindBy(xpath="//div[@data-testid='common-proceed-to-pay']")
	private WebElement proceedtopay;


	public WebElement getCardnumber() {
		return cardnumber;
	}


	public WebElement getCardholdername() {
		return cardholdername;
	}


	public WebElement getExpmonth() {
		return expmonth;
	}


	public WebElement getExpyear() {
		return expyear;
	}


	public WebElement getCvvnumber() {
		return cvvnumber;
	}


	public WebElement getProceedtopay() {
		return proceedtopay;
	}
	
	
	
	
}
