import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class DriveModule extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DriveModule());
        injector.getInstance(Track.class).race();
    }

    @Override
    protected void configure() {
        bind(LeaderBoard.class);
        bind(Track.class).to(LagunaSeca.class).asEagerSingleton();
    }

    @Provides
    Passenger providePassenger() {
        return new Passenger("Chris", 27, 60);
    }

    @Provides
    List<Car> provideCars() {
        try {
            return Arrays.asList(
                    new Car(JsonUtils.getProperties().getJSONObject("s2000")),
                    new Car(JsonUtils.getProperties().getJSONObject("exige")),
                    new Car(JsonUtils.getProperties().getJSONObject("skyline"))
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
