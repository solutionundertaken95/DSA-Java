package src.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccurenceOfEachElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " +n+ " Elements of the array" );
        for(int i =0;i< arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The Entered Elements are : ");
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        countOccurences(arr,n);
    }

    private static void countOccurences(int[] arr, int n) {

        Map<Integer, Integer> map= new HashMap<>();

        for(int j = 0; j< arr.length;j++){
            map.put(arr[j],map.getOrDefault(arr[j],0) +1 );
        }

        System.out.println("The values and their occurences are ");
        for(Map.Entry<Integer, Integer> map1 : map.entrySet()){
            System.out.println("Value : " +map1.getKey() +" Occurences: " +map1.getValue() );
        }
    }
}
