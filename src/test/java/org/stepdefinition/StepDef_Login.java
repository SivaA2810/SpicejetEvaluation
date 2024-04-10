package org.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef_Login extends ProjectSpecification {

	HomePage obj = new HomePage(driver);

    @Given("user click login button")
    public void user_click_login_button() {
      obj.login().getLoginBtn().click();
      obj.login().getLoginwithemail().click();
    }

    @When("try login with {string} {string}")
    public void try_login_with_invalid_credentials(String email,String password) {
    	obj.login().getUsermobileno().sendKeys(email);
    	obj.login().getUserpassword().sendKeys(password);
    }
//    @When("try login with credentials")
//    public void try_login_with_credentials() {
//    	
//    	obj.login().getUsermobileno().sendKeys("8015648363");
//    	obj.login().getUserpassword().sendKeys("Adse9566@");
//    }

    @Then("click submit button")
    public void click_submit_button() {
    	
    	obj.login().getSubmitbtn().click();
    }

    @And("take screen shot and probe the result")
    public void take_screen_shot_and_probe_the_result() throws Exception {
    	
    	obj.getScreenshot("positivelogin");
    }
}





