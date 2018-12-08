package candys;

public abstract class SweetsItem {

    SweetsItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;
    private double weight;

    public double getWeight() {
        return weight;
    }

//    SweetsItem(String name) {
//        this.name = name;
//    }

    public final String getName() {
        return name;
    }

    public abstract double getCost();


}
