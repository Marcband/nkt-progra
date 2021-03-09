package Objektorientierung.Interfaces_Aufgaben;

public class MessageApp {

    public static void main(String[] args) {
        byte key = Byte.parseByte(args[0]);
        String content = args[1];

        Message message = new StringMessage(content);
        Encrypter encrypter = new SimpleEncrypter(key);
        Connection secure = new SecureConnection(encrypter);
        secure.send(message);
    }
}
