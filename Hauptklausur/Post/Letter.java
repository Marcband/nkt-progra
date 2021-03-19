package Hauptklausur.Post;

public class Letter implements Sendable {
    private Address senderAddress;
    private Address receiverAddress;

    public Letter(Address senderAddress, Address receiverAddress) {
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
    }

    @Override
    public Address getSenderAdress() {
        return senderAddress;
    }

    @Override
    public Address getReceiverAddress() {
        return receiverAddress;
    }

    @Override
    public double getWeight() {
        return 100;
    }
}
