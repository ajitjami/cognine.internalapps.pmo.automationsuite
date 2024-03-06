package com.internalapps.pmo.Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/AddEmployee.feature", glue="StepDef",plugin = {"pretty","html:target/cucumber-reports/report.html"})
public class RunnerTest
{
	

}

