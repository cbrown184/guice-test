package cars;

import com.google.inject.Inject;

import java.util.Arrays;
import java.util.List;

public class Cars {

    @Inject
    Exige exige;
    @Inject
    S2000 s2000;
    @Inject
    Skyline skyline;

    public List<Car> getCars(){
        return Arrays.asList(exige, s2000, skyline);
    }
}
