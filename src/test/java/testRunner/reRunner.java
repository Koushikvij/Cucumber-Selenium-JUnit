package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "target/rerun.txt", 
		glue ="stepDefinitions",
		monochrome=true,
		plugin= {"pretty","html:target/cucumber.html",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "rerun:target/rerun.txt"
		})
public class reRunner {

}
