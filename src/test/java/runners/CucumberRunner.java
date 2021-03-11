package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Task1.feature", //provide feature file name(s), all other is pre-set
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
//        tags = {"@NotWorking"},
        dryRun = false, //checks if there are step definitions. dryRun = true <<will scan all the Gherkins, won't run anything
        // if some don't have - it will create - u can copy prepared methods
        glue = {"stepDefinitions"}//location (path) for step definitions (in stepDefinitions folder)
)
public class CucumberRunner {
//
}
