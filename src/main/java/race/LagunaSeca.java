package race;

import cars.Cars;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.inject.Inject;
import java.util.logging.Logger;

public class LagunaSeca implements Track {

    private final String trackName = "Laguna Seca";
    private final double length = 3.602;
    private final double elevationChange = 55;
    private final double lapRecord = 66.309;
    @Inject
    Cars cars;
    @Inject
    private Logger logger;
    @Inject
    private LeaderBoard leaderBoard;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    @Override
    public void race() {
        logger.info(this::toString);
        cars.getCars().stream().forEach(car -> car.race());
        leaderBoard.displayTimes();
    }
}
