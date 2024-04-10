package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnewayTrip extends ProjectSpecification{
	
	public OnewayTrip(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(xpath="//div[@data-testid='one-way-radio-button']")
	private WebElement onewaytripbtn;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	private WebElement from;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	private WebElement destination;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	private WebElement selectdate;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']//div[@data-testid='undefined-month-April-2024']//div[text()='20']")
	private WebElement DepartureDate;
	
	@FindBy(xpath="//div[@data-testid='home-page-travellers']")
	private WebElement pasangerdetails;
	
	@FindBy(xpath="//div[@data-testid='Adult-testID-plus-one-cta']")
	private WebElement addpasengerbtn;
	
	@FindBy(xpath="//div[@data-testid='Children-testID-plus-one-cta']")
	private WebElement addchildbtn;
	
	@FindBy(xpath="//div[@data-testid='Infant-testID-plus-one-cta']")
	private WebElement addinfant;
	
	@FindBy(xpath="(//div[@style='border-bottom-left-radius: 0px; border-top-left-radius: 0px;'])[2]")
	private WebElement currency;
	
	@FindBy(xpath="//div[text()='Family & Friends']")
	private WebElement radianbtn;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")
	private WebElement searchbtn;

	
	public WebElement getOnewaytripbtn() {
		return onewaytripbtn;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getDestination() {
		return destination;
	}

	public WebElement getDepartureDate() {
		return DepartureDate;
	}

	public WebElement getPasangerdetails() {
		return pasangerdetails;
	}

	public WebElement getAddpasengerbtn() {
		return addpasengerbtn;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}
	public WebElement getAddchildbtn() {
		return addchildbtn;
	}

	public WebElement getAddinfant() {
		return addinfant;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getRadianbtn() {
		return radianbtn;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	
	
	
	
	
}
