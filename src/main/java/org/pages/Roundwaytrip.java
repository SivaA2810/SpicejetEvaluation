package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roundwaytrip extends ProjectSpecification{
	public Roundwaytrip(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[2]")
	private WebElement roundwaybutton;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	private WebElement returndate;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-1niwhzg r-z2wwpe r-17b9qp5 r-1g94qm0 r-h3f8nf r-u8s1d r-u3yave r-8fdsdq']//div[@data-testid='undefined-month-April-2024']//div[text()='25']")
	private WebElement selectreturndate;

	public WebElement getRoundwaybutton() {
		return roundwaybutton;
	}

	public WebElement getReturndate() {
		return returndate;
	}

	public WebElement getSelectreturndate() {
		return selectreturndate;
	}
	
	
	
}
