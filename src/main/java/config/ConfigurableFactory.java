package config;

import cars.Car;
import org.json.JSONObject;

public interface ConfigurableFactory {
    Car create(JSONObject config);
}
