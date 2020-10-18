package Common;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestBase {
    public static RequestSpecification request;
    public static Response response;
    public static Logger log=Logger.getLogger(TestBase.class.getName());
    public void log4jConfigure(){
        PropertyConfigurator.configure(Constants.Log4jPath);
        log.debug("Log4j appender configuration is successful !!");
    }
    public RequestSpecification req(){
        request= RestAssured.given();
        return request;
    }
}
