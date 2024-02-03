package Org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions( features= {"src/test/resources/Feature"}, glue= {"Org.stepDefination"}, dryRun= false , strict=true, tags= {"@Regression","@Sanity"},
plugin= {"pretty","html:src\\test\\resources\\Feature\\Report", "json:src\\test\\resources\\Feature\\Report\\report.json"} )

public class testRunner {
	
	

}
