package candys;

import java.io.Serializable;

public abstract class SweetsItem implements Serializable {

    SweetsItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;
    private double weight;

    public SweetsItem() {
    }

    public double getWeight() {
        return weight;
    }

    public final String getName() {
        return name;
    }

    public abstract double getCost();


}
