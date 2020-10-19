package StepDefinition;

import Common.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Common.PropertyHolder.*;
import static Utility.Utilities.*;

public class Pet extends TestBase {
    public String URL;

    @Given("^User has the endpoint \"([^\"]*)\"$")
    public void user_has_the_endpoint_something(String endpoint) throws IOException {
        URL = getKeyValue("Base_URL") + getKeyValue(endpoint);
        APIInitialize();
        log.info("Endpoint is: " + URL);
    }

    @And("^User sets the request body \"([^\"]*)\"$")
    public void user_sets_the_request_body_something(String bodyFile) throws IOException {
        String body = readJson(bodyFile);
        request = request.body(body);
    }

    @And("^User alters json \"([^\"]*)\"$")
    public void user_alters_json_something(String jsonFile, DataTable table) throws IOException {
        String body = updateRequestBody(table, readJson(jsonFile));
        request = request.body(body);
        log.info("Request Body: " + body);
    }

    @When("^User hit the \"([^\"]*)\" request$")
    public void user_hit_the_something_request(String method, DataTable dataToUse) {
        List<List<String>> data = dataToUse.asLists();
        String value = null;
        for (int i = 0; i < data.size(); i++) {
            String param = data.get(i).get(0);
            if (checkProperty(data.get(i).get(2)))
                value = getProperty(data.get(i).get(2));
            else value = data.get(i).get(2);

            if (param.equalsIgnoreCase("Content-type"))
                request = request.contentType(data.get(i).get(1));
            else if (param.equalsIgnoreCase("path-param")) {
                request = request.pathParam(data.get(i).get(1), value);
                log.info("Path param : " + data.get(i).get(1) + " with value : " + value);
            } else if (param.equalsIgnoreCase("query-param")) {
                request = request.queryParam(data.get(i).get(1), value);
                log.info("Query param : " + data.get(i).get(1) + " with value : " + value);
            } else if (param.equalsIgnoreCase("form-param")) {
                request = request.formParam(data.get(i).get(1), value);
                log.info("Form param : " + data.get(i).get(1) + " with value : " + value);
            } else if (param.equalsIgnoreCase("Header")) {
                request = request.header(new Header(data.get(i).get(1), value));
                log.info("Header : " + data.get(i).get(1) + " with value : " + value);
            }

        }
        switch (method) {
            case "GET":
                response = request.when().get(URL);
                break;
            case "POST":
                response = request.when().post(URL);
                break;
            case "PUT":
                response = request.when().put(URL);
                break;
            case "DELETE":
                response = request.when().delete(URL);
                break;
        }
        response.then().log().all();
    }

    @And("^User validates the JsonResponse$")
    public void user_validates_the_jsonresponse(Map<String, String> map) {
        log.info(response.getBody().prettyPrint());
        String value = null;
        for (Map.Entry<String, String> entrySet : map.entrySet()) {
            if (checkProperty(entrySet.getValue()))
                value = getProperty(entrySet.getValue());
            else value = entrySet.getValue();
            Object obj = response.jsonPath().get(entrySet.getKey()).getClass();
            if (obj == Long.class)
                Assert.assertEquals(Long.parseLong(value), response.jsonPath().getLong(entrySet.getKey()));
            else if (obj == String.class)
                Assert.assertEquals(value, response.jsonPath().getString(entrySet.getKey()));
            else if (obj == Integer.class)
                Assert.assertEquals(Integer.parseInt(value), response.jsonPath().getInt(entrySet.getKey()));
        }
    }

    @Then("^User verifies the status code as (.+)$")
    public void user_verifies_the_status_code_as(int statuscode) {
        response.then().statusCode(statuscode);
        log.info("response code matches");
    }

    @And("^User validates the \"([^\"]*)\" value in jsonArray path \"([^\"]*)\"$")
    public void user_validates_the_something_value_in_jsonarray_path_something(String value, String path) {
        compareJsonValue(response.asString(), value, path);
    }

    @And("^User fetches the json values$")
    public void user_fetches_the_json_values(Map<String, String> data) {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            setProperty(entry.getKey(), response.jsonPath().getString(entry.getValue()));
        }
    }
}
