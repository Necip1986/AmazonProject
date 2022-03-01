package ui.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/default-cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},

        tags = "@ParallelTest02",

        features="src/test/resources/uiFeature",

        glue="ui/stepDef",

        //dryRun=false
        publish = true

)
public class ParallelTestRunner2 {

}