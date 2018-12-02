package config;

import cars.*;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.assistedinject.FactoryProvider;
import com.google.inject.name.Names;
import org.json.JSONObject;
import race.LagunaSeca;
import race.LeaderBoard;
import util.JsonUtils;

import java.io.IOException;

public class RaceModule extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new RaceModule());
        injector.getInstance(LagunaSeca.class).init().race();
    }

    @Override
    protected void configure() {

        try {
            JSONObject properties = JsonUtils.getProperties();
            bind(JSONObject.class).annotatedWith(Names.named("carsConf")).toInstance(properties.getJSONObject("carsConf"));
            bind(JSONObject.class).annotatedWith(Names.named("lagunaSeca")).toInstance(properties.getJSONObject("lagunaSeca"));
            bind(ConfigurableFactory.class).toProvider(FactoryProvider.newFactory(ConfigurableFactory.class, Car.class));
            bind(LeaderBoard.class).asEagerSingleton();
            bind(LagunaSeca.class).asEagerSingleton();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
