package src.Arrays;

import java.util.Scanner;

public class LeftRotatebyKPlaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter" + n +" Elements");
        int [] arr = new int[n];

        for (int i=0;i< arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("The Entered array elements are : ");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("How much do you want to left rotate by");
        int k = scanner.nextInt();

        leftRotateByK(arr,k);

        System.out.println("The rotated array elements are : ");
        for (int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    private static void leftRotateByK(int[] arr, int k) {

        int[] temp = new int[arr.length];
        int n = arr.length;

        for (int i=0; i<k; i++){
            temp[i] = arr[i];
        }

        for( int i=k;i< arr.length;i++){
            arr[i-k] = arr[i];
        }

        int p =0;
        for( int i = n-k; i<n;i++){
            arr[i] = temp[p];
            p++;
        }
    }
}
