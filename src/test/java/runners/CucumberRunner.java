package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Sample2.feature",//any number of feature files
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
        //tags = {"@LinkScenario", "@AgePageScenario"},
        dryRun = false,
        glue = {"stepDefinitions"}
)
public class CucumberRunner {
//
}
