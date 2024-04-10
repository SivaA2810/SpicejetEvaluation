package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="project_feature\\login.feature",
					 glue="org\\stepdefinition",
					 //tags ="@loginusingemail",
					 dryRun=false,
					 monochrome = true,
					 plugin = {"pretty",
							    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
					 
					 )
public class TestRunnerLogin {

}



