package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/",glue="StepDefinations",monochrome=true,strict=false,
tags="@Round",plugin= {"pretty","json:target/sas.json"})
public class TestRunner {
	
	

}
