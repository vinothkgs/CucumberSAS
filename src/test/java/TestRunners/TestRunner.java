package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/FlightBook.feature",glue="StepDefinations",monochrome=true)
public class TestRunner {

}
