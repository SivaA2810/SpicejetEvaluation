package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.utils.UtilityMethods;

public class LoginPage extends ProjectSpecification{

	public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	private WebElement loginBtn;
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	private WebElement usermobileno;
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	private WebElement userpassword;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	private WebElement submitbtn;
	
	
	@FindBy(xpath="(//div[@style='margin-right: 20px;'])[4]")
	private WebElement loginwithemail ;
	
	

	public WebElement getLoginwithemail() {
		return loginwithemail;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUsermobileno() {
		return usermobileno;
	}

	public WebElement getUserpassword() {
		return userpassword;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	
//	public void successfullyLogin(String Username ,String ValidInvalid) {
//		if (ValidInvalid.equals("InValidpassword")) {
//		Assert.assertTrue(UtilityMethods.isDisplayed("LocatorName"));
//		}
//		else {
//			Assert.assertTrue(!UtilityMethods.isDisplayed("LocatorName"));
//		}
	

	
	
	
	
	

	
	
}
