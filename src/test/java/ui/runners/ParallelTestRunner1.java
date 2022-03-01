package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},

        tags = "@ParallelTests01",

        features="src/test/resources/uiFeature",

        glue="ui/stepDef",

        dryRun=false

)

public class ParallelTestRunner1 {
}
