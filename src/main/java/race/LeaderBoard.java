package race;

import cars.Car;

import javax.inject.Inject;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LeaderBoard {
    Map<Car, Integer> times = new HashMap<>();

    @Inject
    private Logger logger;

    public void registerTime(Car car, int time) {
        times.put(car, time);
    }

    public void displayTimes() {
        times.keySet().stream().sorted(Comparator.comparing((Car car) -> times.get(car)))
                .forEach(car -> logger.info(times.get(car) + "seconds : " + car));
    }
}
