package org.base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.utils.UtilityMethods;

public class ProjectSpecification extends UtilityMethods{


	public void browserLaunch(String browser, String url) throws Exception {
	launchbrowser(browser, url);
	}
	
	public void brokenLinkcheck() {
	checkBrokenlink();
	}
	
	public void loadUrl(String url) {
	}
	
	public void closeBrowser() {
	browserClose();
	}
	
	public void scrolldown() {
	scrollDownpage();
	}
	
	public void scrollup() {
	scrolluppage();
	}
	
	public void click(WebElement element) {
	clickbtn(element);
	}
	
	public void positionigelement(WebElement element) {
	movetoelement(element);
	}
	
	public void waituntilelementtoclick(WebElement element) {
	webdriverwait(element);
	}
	
	public String valueofAlert(String text) {
	gettextfromAlert();	
	return text;
	}
	
	public void clickusingJS(WebElement element) {
		clickusingjavascript(element);
	}
	
	public String pageTitle() {
	String tit = picktitle();
	return tit;
	}
	
	public void selectbyvaluedropdown(WebElement element,String value) {
		dropdownselectbyvalue(element, value);
	}
	
	public void dropdownByindex(WebElement element,int value) {
		selectbyindex(element, value);
	}
	
	public void pageBack() {
	backthewindow();	
	}
	
	public void forwardPage() {
	forwardthewindow();
	}
	
	public String readFromProperty(String value) throws Exception {
		
	String property = filereader(value);
	return property;
	}
	
	public void SwitchChildwindow() {
		switch_toChildwindowHandles();
	}
	
	public void acceptAllert() {
	acceptA();
	}
	
	public String[][] exceldata() throws Exception {
		
	String [][] data = getValuefromExcel();	
	return data;
	}
	
	public void newdataread() throws Exception {
	getValuefromExcelanothermethod();

	}
	
	
	
	public String getScreenshot(String name) throws Exception{
		String takeScreenShot = takeScreenShot(name);
		return takeScreenShot;
	}
}


