package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports-US1013.html",
                    "json:target/json-reports/cucumber-US1013.json",
                    "junit:target/xml-report/cucumber-US1013.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@wip",
        dryRun = false
)

public class Runner {


}
