package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Sample3.feature",
        plugin = {"pretty", "html:cucumber-report/html-report",
                "junit:cucumber-report/junit-report.xml",
                "json:cucumber-report/json-report.json"},
//        tags = {"@SomeTag"},
        dryRun = false, // if true then check if have created stepdefinitions, if not then it will create stepdefs
        glue = {"stepDefinitions"} //
)
public class CucumberRunner {
//
}
