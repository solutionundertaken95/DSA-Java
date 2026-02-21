package src.LinkedList;



public class Main {
    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(9);
        nums.add(6);
        nums.addFirst(3);
        nums.delete(9);
        nums.printLinkedlist();
    }
}
