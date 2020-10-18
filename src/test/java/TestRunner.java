import Common.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/main/resources/Features",plugin ={"html:reports/cucumber-report.html"},
            glue= {"StepDefinition"},tags={"@PetTest"})
//
    public class TestRunner extends TestBase {
    }
