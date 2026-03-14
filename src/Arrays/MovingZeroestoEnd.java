package src.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MovingZeroestoEnd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " Elements");

        for(int i =0; i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }


        System.out.println("The array elements are : ");
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int l = arr.length;

        addZeroestoEnd(arr,l);

        System.out.println("The new array elements after adding zeroes to end are : ");
        for(int i=0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.println("Program Ends here");
    }

    private static void addZeroestoEnd(int[] arr, int l) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i< arr.length; i++){

            if(arr[i] != 0){
                arrayList.add(arr[i] );
            }
        }

        int j=0;
        for(int k: arrayList){
            arr[j] = k;
            j++;
        }

        for(int m = arrayList.size(); m< l-1; m++){
            arr[m] = 0;
        }
    }


}
