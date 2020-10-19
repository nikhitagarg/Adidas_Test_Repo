import Common.Constants;
import Common.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Features", plugin = {"html:reports/cucumber-report.html"},
        glue = {"StepDefinition"}, tags = {"@UITest"})
//
public class TestRunner extends TestBase {


    @AfterClass
    public static void tearDown() {
        driver.quit();
        log.info("Browser is closed");
    }
}
