package Common;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    public static RequestSpecification request;
    public static Response response;
    public static Logger log = Logger.getLogger(TestBase.class.getName());
    public static WebDriver driver = null;
    public static WebDriverWait wait = null;

    static {
        try {
            init();

        } catch (Exception e) {

        }
    }

    private static synchronized void init() throws Exception {
        PropertyConfigurator.configure(Constants.Log4jPath);
        log.debug("Log4j appender configuration is successful !!");
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);

    }
    public static void APIInitialize(){
        request = RestAssured.given();
    }

    public TestBase() {
    }

    public TestBase(WebDriver driver) {
        this.driver = driver;
    }


}
