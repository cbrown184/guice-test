package cars;

import org.json.JSONObject;

public interface CarFactory {
    Car create(JSONObject config);
}
