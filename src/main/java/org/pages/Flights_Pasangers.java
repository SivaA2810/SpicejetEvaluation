package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights_Pasangers extends ProjectSpecification{
	public Flights_Pasangers(WebDriver driver ) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")
	private WebElement continuebtn;
	
	@FindBy(xpath="(//div[@data-testid='traveller-2-title-field'])")
	private WebElement title;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[3]")
	private WebElement phno;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[4]")
	private WebElement email;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-tmtnm0 r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-13qz1uu']")
	private WebElement country;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[5]")
	private WebElement city;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[2]")
	private WebElement retainmydatacheckbox;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[3]")
	private WebElement emailcheckbox;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[4]")
	private WebElement gstcheckbox;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73'])[5]")
	private WebElement primarypassenger;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	private WebElement pasanger1title ;
	
	
	// 			   (//div[@class='css-1dbjc4n r-1awozwy r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-18u37iz r-1ugchlj'])[4]
	@FindBy(xpath="(//input[@autocomplete='new-password'])[6]")
	private WebElement pasanger1firstname;
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[7]")
	private WebElement pasanger1lastname;
	
	@FindBy(xpath="//div[@class='css-76zvg2 r-jwli3a r-poiln3 r-ubezar r-1kfrs79']")
	private WebElement nextbtn;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-1ugchlj r-1777fci r-ymttw5 r-5njf8e r-1otgn73 r-19554kt r-184en5c']")
	private WebElement pasanger2title;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	private WebElement pasanger2firstname;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-poiln3 r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	private WebElement pasanger2lastname;
	
	
	@FindBy(xpath="(//input[@autocomplete='new-password'])[8]")
	private WebElement pasanger2phno;

	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	private WebElement finalcontinuebtn;
	
	@FindBy(xpath="//div[text()='Master']")
	private WebElement masterbtn;
	
	@CacheLookup
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[2]")
	private WebElement addoncontinuebtn;
	
	@FindBy(id="at_addon_close_icon")
	private WebElement closealert;
	
	public WebElement getClosealert() {
		return closealert;
	}


	public WebElement getAddoncontinuebtn() {
		return addoncontinuebtn;
	}


	public WebElement getMasterbtn() {
		return masterbtn;
	}


	public WebElement getFinalcontinuebtn() {
		return finalcontinuebtn;
	}


	public WebElement getContinuebtn() {
		return continuebtn;
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


	public WebElement getPhno() {
		return phno;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getCountry() {
		return country;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getRetainmydatacheckbox() {
		return retainmydatacheckbox;
	}


	public WebElement getEmailcheckbox() {
		return emailcheckbox;
	}


	public WebElement getGstcheckbox() {
		return gstcheckbox;
	}


	public WebElement getPrimarypassenger() {
		return primarypassenger;
	}


	public WebElement getPasanger1title() {
		return pasanger1title;
	}


	public WebElement getPasanger1firstname() {
		return pasanger1firstname;
	}


	public WebElement getPasanger1lastname() {
		return pasanger1lastname;
	}


	public WebElement getNextbtn() {
		return nextbtn;
	}


	public WebElement getPasanger2title() {
		return pasanger2title;
	}


	public WebElement getPasanger2firstname() {
		return pasanger2firstname;
	}


	public WebElement getPasanger2lastname() {
		return pasanger2lastname;
	}


	public WebElement getPasanger2phno() {
		return pasanger2phno;
	}
	
	
	

	
	
	
	
}


