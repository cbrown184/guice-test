import org.json.JSONObject;

import javax.inject.Inject;
import java.util.Arrays;

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
        Arrays.asList(this.getClass().getDeclaredFields()).stream()
                .filter( field -> field.getAnnotation(Inject.class) == null)
                .forEach( field -> {
                    try {
                        field.set(this, config.get(field.getName()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                });
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
