package com.Runner;

import java.io.File;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Features/myntralLogin.feature" },

		glue = { "com.Stepdeff", "com.Utilities" }, plugin = { "pretty", "html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },

		//monochrome = true

// tags = {"@regression","functional"}
  tags= {"@smoke","@regression" }

)

@Test
public class Runnerclass extends AbstractTestNGCucumberTests {

}
