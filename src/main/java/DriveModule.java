import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import org.json.JSONObject;

import java.io.IOException;


public class DriveModule extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DriveModule());
        injector.getInstance(Car.class).configure();
        injector.getInstance(Track.class).drive();
    }

    @Override
    protected void configure() {
        try {
            bind(JSONObject.class).toInstance(JsonUtils.getProperties().getJSONObject("car"));
            bind(Car.class).asEagerSingleton();
            bind(Track.class).to(LagunaSeca.class).asEagerSingleton();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Provides
    Passenger providePassenger() {
        return new Passenger("Chris", 27, 60);
    }


}
