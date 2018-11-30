import org.json.JSONObject;

import javax.inject.Inject;
import java.util.Random;

public class Car extends Configurable{

    @Inject
    Passenger passenger;

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

    public void race(LeaderBoard leaderBoard){
        leaderBoard.registerTime(this, (new Random().nextInt(60) + 60 ));
    }

    public Car(JSONObject config) {
        configure(config);
    }

    @Override
    public String toString() {
        return "Car{" +
                "passenger=" + passenger +
                ", make='" + make + '\'' +
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
