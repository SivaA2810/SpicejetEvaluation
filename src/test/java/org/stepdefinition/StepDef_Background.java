package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef_Background extends ProjectSpecification{

	 
	@Given("open the browser")
	public void open_Browser() throws Exception{
		browserLaunch("chrome", "https://www.spicejet.com/");
		
	}
	@And("goes to landing page")
	public void launch_Url() {
	
		
	}
	
	
	
	
}
