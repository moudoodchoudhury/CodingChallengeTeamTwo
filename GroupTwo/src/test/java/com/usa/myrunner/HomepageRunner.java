package com.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"C:\\Users\\moudo\\eclipse-workspace\\GroupTwo\\Feature\\Homepage.feature" }, 
tags = "@Homepage", 
glue = {"com.usa.stepdefinition" }, 
plugin = { "pretty", "html:target/cucumber-reports/cucumber.json","json:target/cucumber.json" }, 
monochrome = true,
dryRun = false

)

public class HomepageRunner extends AbstractTestNGCucumberTests {

}
