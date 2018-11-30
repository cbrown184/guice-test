import javax.inject.Inject;
import java.util.Random;

public class LagunaSeca implements Track{
    @Inject
    private Car car;

    private final String trackName = "Laguna Seca";
    private final double length = 3.602;
    private final double elevationChange = 55;
    private final double lapRecord = 66.309;

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", length=" + length + "m" +
                ", elevationChange=" + elevationChange + "m" +
                ", lapRecord=" + lapRecord + "s" +
                '}';
    }

    @Override
    public void drive() {
        System.out.println(toString());
        System.out.println(car);
        System.out.println("Your time: " + (new Random().nextInt(60) + 100) + " s.");
    }
}
