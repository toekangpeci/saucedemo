package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue= {"stepDef"},
        plugin ={"pretty","json:target/cucumber.json"},
        publish = true)
public class testRunner {
}

//**  plugin={"html:target/HTML_report.html"})