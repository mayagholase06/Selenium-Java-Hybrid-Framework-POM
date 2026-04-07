package com.facebook.stepDefinitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Feature", // Feature Folder path
	    glue = "com.facebook.stepDefinitions",   // Step Definitions package name
	    plugin = {
	        "pretty", 
	        "html:target/cucumber-reports.html", // for HTML report
	        "json:target/cucumber.json"           // for JSON report
	    },
	    monochrome = true // for console output
	)
public class TestRunner extends AbstractTestNGCucumberTests {
   
}
