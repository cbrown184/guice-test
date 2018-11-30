import javax.inject.Inject;
import java.util.List;

public class LagunaSeca implements Track{
    @Inject
    private List<Car> carList;
    @Inject
    private LeaderBoard leaderBoard;

    private final String trackName = "Laguna Seca";
    private final double length = 3.602;
    private final double elevationChange = 55;
    private final double lapRecord = 66.309;

    @Override
    public String toString() {
        return "Track{" +
                "trackName='" + trackName + '\'' +
                ", length=" + length + "km" +
                ", elevationChange=" + elevationChange + "m" +
                ", lapRecord=" + lapRecord + "s" +
                '}';
    }

    @Override
    public void race() {
        System.out.println(toString());
        carList.stream().forEach( car -> car.race(leaderBoard));
        leaderBoard.displayTimes();
    }
}
