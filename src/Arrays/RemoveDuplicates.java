package src.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

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

        Set<Integer> duplicates = removeDuplicates(arr,l);

        System.out.println("The length of new array is : " +duplicates.size());


        System.out.println("The new array elements removing duplicates are : ");
        System.out.print(duplicates);

        System.out.println();

        System.out.println("Program Ends here");
    }

    private static Set<Integer> removeDuplicates(int[] arr, int l) {

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<l; i++){
            set.add(arr[i]);
        }

        int j=0;
        for( int k : set){
            arr[j] = k;
            j++;
        }


        return set;
    }
}
