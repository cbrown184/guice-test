package cars;

import util.JsonUtils;

import java.io.IOException;

public class S2000 extends Car {
    public S2000() throws IOException {
        configure(JsonUtils.getProperties().getJSONObject("s2000"), this.getClass().getSuperclass());
    }
}
