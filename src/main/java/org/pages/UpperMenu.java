package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpperMenu extends ProjectSpecification{
	
	public UpperMenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1kb76zh r-1jy2w8o'])[1]")
	private WebElement flights;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1kb76zh r-1jy2w8o'])[2]")
	private WebElement checkin;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1kb76zh r-1jy2w8o'])[3]")
	private WebElement flightstatus;
	

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1kb76zh r-1jy2w8o'])[4]")
	private WebElement managebooking;
	

	


	public WebElement getCheckin() {
		return checkin;
	}


	public WebElement getFlightstatus() {
		return flightstatus;
	}


	public WebElement getManagebooking() {
		return managebooking;
	}


	public WebElement getFlights() {
		return flights;
	}
	
	
	
	
	
	
}

