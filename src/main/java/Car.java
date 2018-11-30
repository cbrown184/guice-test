import org.json.JSONObject;

import javax.inject.Inject;

public class Car {

    @Inject
    JSONObject config;
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


    Car init(){
        make = config.getString("make");
        model = config.getString("model");
        engineType = config.getString("engineType");
        displacement = config.getInt("displacement");
        redline = config.getInt("redline");
        weight = config.getInt("weight");
        height = config.getInt("height");
        width = config.getInt("width");
        length = config.getInt("length");
        wheelBase = config.getInt("wheelBase");
        bhp = config.getInt("bhp");
        year = config.getInt("year");
        return this;
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
