package cars;

import com.google.inject.Inject;
import config.Configurable;
import race.LeaderBoard;

import java.util.Random;

public class Car extends Configurable {

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
    LeaderBoard leaderBoard;

    public void race(){
        Random random = new Random();
        leaderBoard.registerTime(this, random.nextInt(60) + 60);
    }

    @Override
    public String toString() {
        return "cars.Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", displacement=" + displacement + " cc" +
                ", redline=" + redline + "rpm" +
                ", weight=" + weight + " kg" +
                ", height=" + height + "mm" +
                ", width=" + width + " mm" +
                ", length=" + length + " mm" +
                ", wheelBase=" + wheelBase + " mm" +
                ", bhp=" + bhp +
                ", year=" + year +
                '}';
    }
}
