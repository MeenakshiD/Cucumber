package MyRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions

        (


                features = {"src/main/resources/features"},
                glue = { "MySteps" },
                tags="@Verify or @Sorting",
                plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                        "json:target/JSONReports/report.json",
                        "html:target/HtmlReports"}
        )



public class TestRunner {


}