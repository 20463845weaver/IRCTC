package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/anubhavchoudhary/eclipse-workspace/IRCTC/src/main/java/Features"
		,glue={"Bindings"}
		,tags = "@Brands"
		,dryRun = true

		)


public class Runner {

}
                                         


  