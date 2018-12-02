package config;

import cars.*;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.assistedinject.FactoryModuleBuilder;
import com.google.inject.assistedinject.FactoryProvider;
import com.google.inject.name.Names;
import org.json.JSONObject;
import race.LagunaSeca;
import race.LeaderBoard;
import race.Passenger;
import race.Track;
import util.JsonUtils;

import java.io.IOException;

public class DriveModule extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DriveModule());
        injector.getInstance(Track.class).race();
    }

    @Override
    protected void configure() {

        try {
            JSONObject properties = JsonUtils.getProperties();

            bind(JSONObject.class).annotatedWith(Names.named("exigeConf")).toInstance(properties.getJSONObject("exige"));
            bind(JSONObject.class).annotatedWith(Names.named("s2000Conf")).toInstance(properties.getJSONObject("s2000"));
            bind(JSONObject.class).annotatedWith(Names.named("skylineConf")).toInstance(properties.getJSONObject("skyline"));

            bind(CarFactory.class).toProvider(FactoryProvider.newFactory(CarFactory.class, Car.class));
            bind(LeaderBoard.class).asEagerSingleton();
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
