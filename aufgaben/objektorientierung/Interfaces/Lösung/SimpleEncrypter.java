package Objektorientierung.Interfaces_Aufgaben;

public class SimpleEncrypter implements Encrypter {

    private byte key;
    SimpleEncrypter(byte key){
        this.key = key;
    }

    public void encrypt(byte[] bytes){
        for(int i=0;i<bytes.length;i++){
            bytes[i]+=key;
        }
    }

}
