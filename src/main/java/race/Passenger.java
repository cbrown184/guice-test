package race;

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
        return "race.Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight + "kg" +
                '}';
    }
}
