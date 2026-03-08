package src.Concepts;

public class Recursion2 {

    public static void printnum(int num){

        if(num==0){
            return;
        }

        System.out.println(num);
        printnum(num - 1);


    }

    public static void main(String[] args) {

        int num = 5;

        printnum(num);

    }
}
