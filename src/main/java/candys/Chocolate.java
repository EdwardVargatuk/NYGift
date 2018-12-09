package candys;

import java.io.Serializable;

public class Chocolate extends SweetsItem implements Serializable {
    private double pricePer100g;

    Chocolate(String name, double weight, double pricePer100g) {
        super(name, weight);
        this.pricePer100g = pricePer100g;
    }

    public double getPricePer100g() {
        return pricePer100g;
    }

    @Override
    public double getCost() {
        return (pricePer100g * 10);
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\nprice per 100 g: "
                + getPricePer100g() + "\ncost: " + getCost();
    }
}

