package Objektorientierung.Interfaces_Aufgaben;

abstract public class Connection {

    abstract protected byte[] convert(Message message);


    public final void send(Message message){
        byte[] data = convert(message);
        Network.send(data);
    }
}
