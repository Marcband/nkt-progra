package video.lists;

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
}