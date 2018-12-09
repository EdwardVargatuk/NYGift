package candys;

import java.io.Serializable;

public class Lollipops extends SweetsItem implements Serializable {

    private double cost;

    public Lollipops(String name, double weight,  double cost) {
        super(name, weight);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\ncost: " + getCost()+"\n";
    }
}
