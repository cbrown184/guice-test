import org.json.JSONObject;

import javax.inject.Inject;
import java.util.Arrays;

public class Configurable {
    @Inject
    JSONObject config;
    void configure(){
        Arrays.asList(this.getClass().getDeclaredFields()).stream()
                .filter( field -> field.getAnnotation(Inject.class) == null)
                .forEach( field -> {
                    try {
                        field.set(this, config.get(field.getName()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }
}
