package Utility;

import Common.Constants;
import Common.TestBase;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import io.cucumber.datatable.DataTable;
import org.json.*;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.Properties;

public class Utilities extends TestBase {
    public static String getKeyValue(String key) throws IOException {
        String path = null;
        if (key.startsWith("ENDPOINT"))
            path = Constants.endpointPath;
        else path = Constants.configPath;
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }

    public static String readJson(String jsonName) {
        String json=null;
        try {
           File file = new File(Constants.BASEPATH+"/src/main/resources/Repository/RequestJsonFiles/" + jsonName + ".txt");
           json=new String(Files.readAllBytes(Paths.get(file.toURI())));
        } catch (Exception e) {
        }
        return json;

    }

    public static String updateRequestBody(DataTable table, String jsonBody) {

        for (int i = 0; i < table.asLists().size(); i++) {
            if (table.asLists().get(i).get(0).equalsIgnoreCase("key to remove")) {
                jsonBody = removeKeyUsingJsonString(jsonBody, table.asLists().get(i).get(1));
            } else
                jsonBody = updateKeyValueInJson(jsonBody, table.asLists().get(i).get(0), table.asLists().get(i).get(1));
        }
        return jsonBody;
    }

    public static String updateKeyValueInJson(String jsonString, String jsonPath, String valueToBeUpdated) {
        String json = null;
        try {
            Object document = Configuration.defaultConfiguration().jsonProvider().parse(jsonString);
            Object addObject = Configuration.defaultConfiguration().jsonProvider().parse(valueToBeUpdated);
            DocumentContext updateJson = JsonPath.parse(document).set(jsonPath, addObject);
            json = updateJson.jsonString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    public static String removeKeyUsingJsonString(String jsonString, String jsonPath) {
        String json = null;
        try {
            Object document = Configuration.defaultConfiguration().jsonProvider().parse(jsonString);
            DocumentContext updateJson = JsonPath.parse(document).delete(jsonPath);
            json = updateJson.jsonString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }
    public static void compareJsonValue(String jsonResponse,String value,String path){
        JSONArray array=new JSONArray(jsonResponse);
        JSONObject json=new JSONObject();
        int size=array.length();
        for(int i=0;i<size;i++){
            json=array.getJSONObject(i);
            Assert.assertEquals(value,response.jsonPath().get("["+i+"]"+path));
            log.info("Value matches to that in response body");
        }
    }
}

