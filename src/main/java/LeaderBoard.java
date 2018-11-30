import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LeaderBoard {
    Map<Car, Integer> times = new HashMap<>();

    public void registerTime(Car car, int time){
        times.put(car, time);
    }
    public void displayTimes(){
        times.keySet().stream().sorted(Comparator.comparing((Car car) -> times.get(car)))
                .forEach(car -> System.out.println(times.get(car) + "seconds : " + car));
    }
}
