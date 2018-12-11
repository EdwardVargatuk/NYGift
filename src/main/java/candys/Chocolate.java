package candys;

import java.io.Serializable;

public class Chocolate extends SweetsItem implements Serializable {
    private double price;

   public Chocolate(String name, double weight, double pricePer) {
        super(name, weight);
        this.price = pricePer;
    }

    double getPrice() {
        return price;
    }

    @Override
    public double getCost() {
        return (price);
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\nprice: "
                + getPrice() + "\ncost: " + getCost()+"\n";
    }
}

