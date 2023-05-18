package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/anubhavchoudhary/eclipse-workspace/IRCTC/src/"
				+ "main/java/Features/petstore.feature"
		,glue = {"Bindings"}
		,tags = "@Petstore"
		,plugin = {"pretty","html:petstoreTarget/HtmlReports/petstoreReport.html",
						"pretty","junit:petstoreTarget/JunitReports/petstoreReport.xml",
						"pretty","json:petstoreTarget/JsonReports/petstoreReport.xml"}
		)

public class petstoreRunner {

}
//ji)+N5rzr2vfh/_