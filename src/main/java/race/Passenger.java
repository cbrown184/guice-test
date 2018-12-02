package race;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Passenger {
    private String name;
    private int age;
    private double weight;

    public Passenger(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
