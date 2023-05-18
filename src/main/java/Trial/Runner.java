package Trial;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/anubhavchoudhary/eclipse-workspace/IRCTC/src/main/java/Trial/Logintest.feature"
		,glue={"Trial"}
		)


public class Runner {

}
                                         


  