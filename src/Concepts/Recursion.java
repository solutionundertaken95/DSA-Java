package src.Concepts;

public class Recursion {
//printing from 1 to n


    public static void printnum(int num){

        if(num==0){
            return;
        }

        printnum(num - 1);
        System.out.println(num);

    }

    public static void main(String[] args) {

        int num = 5;

        printnum(num);

    }
}
