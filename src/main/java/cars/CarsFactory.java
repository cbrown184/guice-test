package cars;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import config.ConfigurableFactory;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class CarsFactory {

    @Inject
    ConfigurableFactory carFactory;

    @Inject
    @Named("carsConf")
    JSONObject carsConf;

    public List<Car> getCars() {
        return Arrays.asList(
                carFactory.create((JSONObject) carsConf.get("exige")),
                carFactory.create((JSONObject) carsConf.get("s2000")),
                carFactory.create((JSONObject) carsConf.get("skyline"))
        );
    }
}
