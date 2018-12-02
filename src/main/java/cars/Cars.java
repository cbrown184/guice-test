package cars;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

public class Cars {

    @Inject
    CarFactory carFactory;

    @Inject
    @Named("exigeConf")
    JSONObject exigeConf;

    @Inject
    @Named("s2000Conf")
    JSONObject s2000Conf;

    @Inject
    @Named("skylineConf")
    JSONObject skylineConf;

    public List<Car> getCars() {
        return Arrays.asList(
                carFactory.create(exigeConf),
                carFactory.create(s2000Conf),
                carFactory.create(skylineConf)
        );
    }
}
