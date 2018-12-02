package cars;

import util.JsonUtils;

import java.io.IOException;

public class Skyline extends Car {
    public Skyline() throws IOException {
        configure(JsonUtils.getProperties().getJSONObject("skyline"), this.getClass().getSuperclass());
    }
}
