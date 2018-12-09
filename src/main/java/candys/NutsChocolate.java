package candys;

public class NutsChocolate extends Chocolate {

    private String nameTopping;

    public int getCostTopping() {
        return costTopping;
    }

    private int costTopping;

    public NutsChocolate(String nameChocolate, double weightChocolate,double pricePer100gChocolate, String nameTopping, int costTopping) {
        super(nameChocolate, weightChocolate, pricePer100gChocolate);
        this.nameTopping = nameTopping;
        this.costTopping = costTopping;
    }


    public String getNameTopping() {
        return nameTopping;
    }

    @Override
    public double getCost() {
        return super.getCost() + costTopping;
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\nprice per 100 g: "
                + getPricePer100g()+"\nname of Topping: " + getNameTopping() + "\ncost of Topping: " + getCostTopping()
                + "\ncost: " + getCost();
    }
}
