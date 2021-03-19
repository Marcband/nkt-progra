package Hauptklausur.Post;

public class Order {



    private Sendable[] sendables;

    public Order(Sendable sendable) {
        this.sendables = new Sendable[1];
        this.sendables[0] = sendable;
    }

    public Order(Sendable[] sendables) {
        this.sendables = sendables;
    }

    static int calculatePostage(Sendable sendable){
        int total = 0;
        if(!sendable.getReceiverAddress().getCountry().equals("Germany")) total = 2;
        double w = sendable.getWeight();
        if (w<=100) return total+1;
        else if (w<=2000) return total+3;
        else return total+5;
    }

    int calculateFullPostage() {
        int cost = 0;
        for(int i=0;i<sendables.length;i++){
            cost+=calculatePostage(sendables[i]);
        }

        return cost;
    }
    //Nicht Teil der Aufgabe, main nur zum testen:
    public static void main(String[] args) {
        Address uni_d = new Address("Germany","Düsseldorf",40225,"Unistraße",1);
        Address uni_k = new Address("Germany","Köln",50923,"Albertus-M-P",1);
        Sendable[] sendables = new Sendable[5];
        sendables[0] = new Letter(uni_d,uni_k);
        sendables[1] = new Letter(uni_d,uni_k);
        for (int i = 2; i < 5; i++) {
            sendables[i] = new Parcel(uni_d,uni_k,600*i);
        }
        Order order = new Order(sendables);
        System.out.println(order.calculateFullPostage());
    }

}
