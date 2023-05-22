package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/anubhavchoudhary/eclipse-workspace/IRCTC/src/main/java/Features"
		,glue={"Bindings"}
//		,tags = "@ABC"
//		,dryRun = true,
//		monochrome = true
		)


public class Runner extends AbstractTestNGCucumberTests{

}
                                         


  