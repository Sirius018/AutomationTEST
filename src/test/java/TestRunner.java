import groovy.util.logging.Slf4j;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber/report.json",
                "pretty",
                "html:target/cucumber-reports.html"
        },
        features = "src/test/resources/features"
)
@Slf4j
public class TestRunner {
}