package race;

import cars.Cars;
import javax.inject.Inject;

public class LagunaSeca implements Track {

    @Inject
    private LeaderBoard leaderBoard;
    @Inject
    Cars cars;
    private final String trackName = "Laguna Seca";
    private final double length = 3.602;
    private final double elevationChange = 55;
    private final double lapRecord = 66.309;

    @Override
    public String toString() {
        return "race.Track{" +
                "trackName='" + trackName + '\'' +
                ", length=" + length + "km" +
                ", elevationChange=" + elevationChange + "m" +
                ", lapRecord=" + lapRecord + "s" +
                '}';
    }

    @Override
    public void race() {
        System.out.println(toString());
        cars.getCars().stream().forEach( car -> car.race());
        leaderBoard.displayTimes();
    }
}
