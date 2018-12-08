package candys;


public class Waffle extends SweetsItem   {

    private int numWaffle;
    private double pricePerPiece;

    public Waffle(String name, double weight, int numWaffle, int pricePerPiece) {
        super(name, weight);

        this.numWaffle = numWaffle;
        this.pricePerPiece = pricePerPiece;
    }

    public int getNumWaffle() {
        return numWaffle;
    }

    public double getPricePerPiece() {
        return pricePerPiece;
    }

    @Override
    public double getCost() {
        return  (numWaffle * pricePerPiece );
    }

}
