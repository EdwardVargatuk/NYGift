package candys;

public class Lollipops extends SweetsItem {

    private double cost;

    public Lollipops(String name, double weight,  double cost) {
        super(name, weight);
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
