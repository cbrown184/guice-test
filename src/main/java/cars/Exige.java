package cars;

import util.JsonUtils;

import java.io.IOException;

public class Exige extends Car {
    public Exige() {
        try {
            configure(JsonUtils.getProperties().getJSONObject("exige"), this.getClass().getSuperclass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
