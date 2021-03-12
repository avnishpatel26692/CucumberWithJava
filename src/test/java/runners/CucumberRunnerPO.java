package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/usingPO/Sample2UsingPO.feature",
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
//        tags = {"@Test3-1"},
        dryRun = false,
        glue = {"stepDefinitions"}
)
public class CucumberRunnerPO {

}