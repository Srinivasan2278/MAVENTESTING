package runner;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features"
		,glue={"testDefinitions"} ,
	/*	tags = "@smoke",*/
	      /*  	tags = "@Testexcel", */
	        	monochrome = true,
		plugin = {"pretty","html:target/MAVEN_TESTING.html","json:target/MAVEN_TESTING.json"}
		)
public class cucumberRunner {

}


