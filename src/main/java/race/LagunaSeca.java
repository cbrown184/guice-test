package race;

import cars.CarsFactory;
import config.Configurator;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.json.JSONObject;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Logger;

public class LagunaSeca extends Configurator {



    private String trackName;
    private double length;
    private double elevationChange;
    private double lapRecord;

    @Inject
    @Named("lagunaSeca")
    JSONObject jsonObject;

    @Inject
    CarsFactory cars;
    @Inject
    private Logger logger;
    @Inject
    private LeaderBoard leaderBoard;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public LagunaSeca init(){
        configure(jsonObject);
        return this;
    }
    public void race() {
        logger.info(this::toString);
        cars.getCars().stream().forEach(car -> car.race());
        leaderBoard.displayTimes();
    }
}
