package config;

import cars.Exige;
import cars.S2000;
import cars.Skyline;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import race.LagunaSeca;
import race.LeaderBoard;
import race.Passenger;
import race.Track;

public class DriveModule extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DriveModule());
        injector.getInstance(Track.class).race();
    }

    @Override
    protected void configure() {

        try {
            bind(Exige.class).toConstructor(Exige.class.getConstructor());
            bind(S2000.class).toConstructor(S2000.class.getConstructor());
            bind(Skyline.class).toConstructor(Skyline.class.getConstructor());
            bind(LeaderBoard.class).asEagerSingleton();
            bind(Track.class).to(LagunaSeca.class).asEagerSingleton();

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @Provides
    Passenger providePassenger() {
        return new Passenger("Chris", 27, 60);
    }

}
