package Objektorientierung.Interfaces_Aufgaben;

public class SecureConnection extends Connection {

    private Encrypter encrypter;

    SecureConnection(Encrypter encrypter){
        this.encrypter=encrypter;
    }

    public byte[] convert(Message message){
        byte[] b = message.getContent();
        encrypter.encrypt(b);
        return b;
    }

}
