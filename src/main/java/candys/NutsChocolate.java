package candys;

import java.io.Serializable;

public class NutsChocolate extends Chocolate implements Serializable {

    private String nameTopping;

    private double getCostTopping() {
        return costTopping;
    }

    private double costTopping;

    public NutsChocolate(String nameChocolate, double weightChocolate,double priceChocolate, String nameTopping, double costTopping) {
        super(nameChocolate, weightChocolate, priceChocolate);
        this.nameTopping = nameTopping;
        this.costTopping = costTopping;
    }


    private String getNameTopping() {
        return nameTopping;
    }

    @Override
    public double getCost() {
        return super.getCost() + costTopping;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\nprice of Chocolate: "
                + getPrice()+"\nname of Topping: " + getNameTopping() + "\ncost of Topping: " + getCostTopping()
                + "\ncost: " + getCost()+"\n";
    }
}
