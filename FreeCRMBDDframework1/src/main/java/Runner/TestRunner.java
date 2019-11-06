package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Kushan\\eclipse-workspace\\FreeCRMBDDframework1\\src\\main\\java\\Features\\tagging.feature", 
glue = {"StepDefinitions"},
format = {"pretty", "html:test-outout", "json:json-output/cucumber.json", "junit:junit_xml/cucumber.xml"},
monochrome = true,
strict = true,
dryRun = false,
tags = {"~@SmokeTest","~@End2Endtest","~@RegressionTest"}
)
public class TestRunner {

}

//ANDed : {"@SmokeTest","@End2Endtest"} -- execute all test cases tagged as @smoke and @end2end
//ORed : {"@SmokeTest,@End2Endtest"} -- execute all test cases tagged as @smoke or @end2end

