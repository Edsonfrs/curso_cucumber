package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
glue= {"StepsDefinitions"},
monochrome = true,
plugin={"pretty", "html:target/HtmlReport/report.html",
		"json:target/JSONReport/report.json",
		"junit:target/JUnitReports/report.xml"})
//,tags="@SmokeTest")
public class TestRunner {

}
