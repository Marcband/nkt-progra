package bbb.hk1819_7;

public class LinkedList {
    public Node head = null;

    /*
    Gegeben  seien  die  nachstehenden  Klassen  (nicht  vollst ̈andig)f ̈ur  eine  einfach  verkettete  Liste.
    Die  Liste  speichert  nur  positive  Zahlen  inklusive0.  Implementieren  Sie  in  der  KlasseLinkedListeine
    MethodegetMax,  welche  denmaximalen Wert zur ̈uckgibt. Die L ̈osung soll iterativ erfolgen. Bei Fehlern und
    nichtauffindbarem Maximalwert ist der Wert-1zur ̈uckzugeben
     */

    public int getMax() {
        Node temp = head;
        int max = -1;
        if(head != null) max = head.element;
        while (temp.next != null) {
            temp = temp.next;
            if(temp.element > max) max = temp.element;
        }
        return max;
    }

    public void switchFrontBack() {
        Node temp = head;
        int help = head.element;
        while(temp.next != null) {
            temp = temp.next;
        }
        head.element = temp.element;
        temp.element = help;
    }

    public void append(int value) {
        Node n = new Node(value);
        if(head == null) head = n;
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
    }

    public void print() {
        if(head == null) return;
        Node temp = head;
        System.out.println(temp.element);
        while(temp.next != null) {
            temp = temp.next;
            System.out.println(temp.element);
        }
    }
}
