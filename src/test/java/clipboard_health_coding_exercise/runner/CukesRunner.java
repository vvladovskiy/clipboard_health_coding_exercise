package clipboard_health_coding_exercise.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" ,
//                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features" ,
        glue = "clipboard_health_coding_exercise/step_definitions",
        dryRun = true,
        tags = "@smoke"
)
public class CukesRunner {
}
