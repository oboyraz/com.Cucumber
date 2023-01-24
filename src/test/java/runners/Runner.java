package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports-US1012.html",
                    "json:target/json-reports/cucumber-US1012.json",
                    "junit:target/xml-report/cucumber-US1012.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        dryRun = false
)

public class Runner {


}
