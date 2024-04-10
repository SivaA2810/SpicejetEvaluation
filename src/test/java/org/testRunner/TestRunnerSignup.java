package org.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="project_feature\\signup.feature",
					 glue="org\\stepdefinition",
					 //tags ="@negative", 
					 dryRun=false,
					 monochrome = true,
					 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
					 )
public class TestRunnerSignup {

}


