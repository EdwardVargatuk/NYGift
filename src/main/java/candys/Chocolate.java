package candys;

public class Chocolate extends SweetsItem {
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
}
