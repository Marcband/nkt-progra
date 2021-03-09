package Objektorientierung.Interfaces_Aufgaben;

import java.nio.charset.StandardCharsets;

public class Network {


    public static void send(byte[] data) {
        System.out.println(new String(data, StandardCharsets.UTF_8));
    }
}
