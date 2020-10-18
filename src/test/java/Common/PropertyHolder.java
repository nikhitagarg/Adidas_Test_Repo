package Common;

import java.util.HashMap;
import java.util.Map;

public class PropertyHolder {
    public static final Map<String, String> propertyMap = new HashMap<>();

    public static String getProperty(String key) {
        return propertyMap.get(key);
    }

    public static String setProperty(String key, String value) {
        return propertyMap.put(key, value);
    }

    public static boolean checkProperty(String key)
    {
        return propertyMap.containsKey(key);
    }
}
