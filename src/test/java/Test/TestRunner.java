package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Rohit Nagar\\eclipse-workspace\\CaseStudy\\src\\test\\resources\\feature\\xyz.feature",glue = "Steps", plugin = "html:target/cucumber.html" )
public class TestRunner {
	
}
