package cars;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import config.Configurator;
import config.NonConfigurable;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.json.JSONObject;
import race.LeaderBoard;

import java.util.Random;

public class Car extends Configurator {

    String make;
    String model;
    String engineType;
    int displacement;
    int redline;
    int weight;
    int height;
    int width;
    int length;
    int wheelBase;
    int bhp;
    int year;

    @Inject
    @NonConfigurable
    LeaderBoard leaderBoard;

    public void race() {
        Random random = new Random();
        leaderBoard.registerTime(this, random.nextInt(60) + 60);
    }

    @Inject public Car(@Assisted JSONObject config){
        configure(config);
    }
    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
