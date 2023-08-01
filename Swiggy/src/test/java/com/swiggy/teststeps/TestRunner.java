package com.swiggy.teststeps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.swiggy.teststeps",
		tags = "@TC_001"
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
