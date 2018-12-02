package cars;

import util.JsonUtils;

import java.io.IOException;

public class Exige extends Car{
    public Exige() throws IOException {
        configure(JsonUtils.getProperties().getJSONObject("exige"));
    }
}
