package tasks.lists;

public class LinkedList {
    private Node head;

    private class Node {
        int value;
        Node next;

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void append(int value) {
        Node n = new Node(value, null);
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
        System.out.println(temp.value);
        while(temp.next != null) {
            temp = temp.next;
            System.out.println(temp.value);
        }
    }

    //Aufgaben
    public int length() {
        if (head == null) return 0;
        Node temp = head;
        int length = 1;
        while(temp.next != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public void remove(int index) {
        if(index >= length()) return;
        if(index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++) {
            temp = temp.next;
        }
        if(temp.next.next == null) temp.next = null;
        else {
            temp.next = temp.next.next;
        }
    }

    public int get(int index) {
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }
}
