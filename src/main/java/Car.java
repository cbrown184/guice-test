
import javax.inject.Inject;

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
