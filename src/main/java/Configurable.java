import org.json.JSONObject;

import javax.inject.Inject;
import java.util.Arrays;

public class  Configurable {

    void configure(JSONObject config){
        Arrays.asList(this.getClass().getDeclaredFields()).stream()
                .filter( field -> field.getAnnotation(Inject.class) == null && field.getAnnotation(NonConfigurable.class) == null )
                .forEach( field -> {
                    try {
                        field.set(this, config.get(field.getName()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
    }

}
