package config;

import com.google.inject.assistedinject.Assisted;
import org.json.JSONObject;

import javax.inject.Inject;
import java.util.Arrays;


public class Configurator {


    protected Configurator configure(JSONObject config) {
        Arrays.stream(getClass().getDeclaredFields())
                .filter(field -> field.getAnnotation(Inject.class) == null && field.getAnnotation(NonConfigurable.class) == null)
                .forEach(field -> {
                    try {
                        field.setAccessible(true);
                        field.set(this, config.get(field.getName()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
        return this;
    }
}
