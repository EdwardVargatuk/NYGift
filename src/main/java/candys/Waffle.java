package candys;


import java.io.Serializable;

public class Waffle extends SweetsItem implements Serializable {

    private int numWaffle;
    private double pricePerPiece;

    public Waffle(String name, double weight, int numWaffle, double pricePerPiece) {
        super(name, weight);

        this.numWaffle = numWaffle;
        this.pricePerPiece = pricePerPiece;
    }

    private int getNumWaffle() {
        return numWaffle;
    }

    private double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public double getCost() {
        return  (numWaffle * pricePerPiece );
    }

    @Override
    public String toString() {
        return "name: " + getName() + "\nweight: " + getWeight() + "\nnumber of waffles: "
                + getNumWaffle() + "\nprice per piece: "
                + getPricePerPiece()+ "\ncost: " + getCost()+"\n";
    }

}
