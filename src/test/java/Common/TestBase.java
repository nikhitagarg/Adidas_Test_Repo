package Common;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {
    public static RequestSpecification request;
    public static Response response;
    public static Logger log = Logger.getLogger(TestBase.class.getName());
    public static WebDriver driver=null;
    static {
        try {
            init();

        } catch (Exception e) {

        }
    }

    private static synchronized void init() throws Exception {
        PropertyConfigurator.configure(Constants.Log4jPath);
        log.debug("Log4j appender configuration is successful !!");
        request = RestAssured.given();
        System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
        driver = new ChromeDriver();

    }
    public TestBase(){}

     public TestBase(WebDriver driver) {
        this.driver=driver;
    }

}
