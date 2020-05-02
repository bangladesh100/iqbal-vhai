package com.Runner;

import java.io.File;

import org.junit.AfterClass;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	
@CucumberOptions(features = { "Features" }, 
glue = {"com.Stepdeff","com.Utilities"},plugin= { "pretty",
	 	"html:target/cucumber-htmlreport", 
	 	"json:target/cucumber-report.json",
	 	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		tags= {"@Regression"},		 
				 
				monochrome = true
				)


public class RunnerClass extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/loginreport.xml"));

	}
}