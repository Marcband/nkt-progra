package Hauptklausur.Post;

public class Parcel extends Letter{
    private double weight;

    public Parcel(Address senderAddress, Address receiverAddress, double weight) {
        super(senderAddress, receiverAddress);
        this.weight = weight;
    }


    @Override
    public double getWeight() {
        return this.weight;
    }
}
