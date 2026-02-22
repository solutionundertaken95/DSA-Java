package src.Stack;

public class Stack {

    int top;
    int size;

    private int[] arr = new int[5];

    public Stack(){
        top = -1;
        size = arr.length;
    }



    public void push(int data){

        top++;
        if(top<size){
            arr[top] = data;
        }
        else
            System.out.println("Stack Overflow");

    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr[--top];
    }

    public int peek(){
        return arr[top];
    }

    public void printStack(){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
