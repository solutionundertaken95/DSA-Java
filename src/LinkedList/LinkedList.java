package src.LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    public void add(int data){

        Node node = new Node(data);

        if(head == null){
            head = node;
        }
        else{
            Node current = head;

            while (current.next != null){
                current = current.next;
            }

            current.next = node;
        }
    }

    public void printLinkedlist(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void addFirst(int data){

        Node newnode = new Node(data);

        Node current = head;

        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = current;
            head = newnode;

        }
    }

    public void delete(int data){
        Node current = head;

        while(current.next != null && current.next.data != data){
            current = current.next;
        }
        current.next = current.next.next;
    }


}
