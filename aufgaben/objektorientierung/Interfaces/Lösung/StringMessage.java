package Objektorientierung.Interfaces_Aufgaben;

public class StringMessage implements Message{
    private String nachricht;

    StringMessage(String nachricht){
        this.nachricht=nachricht;
    }
    @Override
    public byte[] getContent(){
        return nachricht.getBytes();
    }
}
