package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/anubhavchoudhary/git/repository/IRCTC/src/main/java/Features/petstore.feature"
		,glue = {"Bindings"}
		,tags = "@Petstore"

		)

public class petstoreRunner {

}
