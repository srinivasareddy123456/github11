package StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRM",
glue="StepDefination",
monochrome=true,
dryRun=true
)

public class TestRunner {
	
	

}
