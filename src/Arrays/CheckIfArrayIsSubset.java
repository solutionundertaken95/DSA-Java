package src.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArrayIsSubset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of first array");
        int m = scanner.nextInt();

        System.out.println("Enter the " + m + " Elements");
        int [] first = new int[m];
        for(int i=0;i<m;i++){
          first[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of second array");
        int n = scanner.nextInt();

        System.out.println("Enter the " + n + " Elements");
        int [] second = new int[n];
        for(int i=0;i<n;i++){
            second[i] = scanner.nextInt();
        }

        boolean subset = isSubset(first,second,m,n);

        if(!subset){
            System.out.println("Not a subset");
        }
        else
            System.out.println("It is a subset");
    }

    private static boolean isSubset(int[] first, int[] second, int m, int n) {

        Arrays.sort(first);

        if(n>m) {
            return false;
        }

            for(int i=0;i<n;i++){
                boolean isPresent = binarySearch(second[i],first,m);
                if(!isPresent){
                    return false;
                }

            }
            return true;
    }

    private static boolean binarySearch(int data, int[] first, int m) {

        int start = 0;
        int end = m-1;

        while(start<=end){
            int mid = (start + end)/2;

            if(first[mid] == data){
                return true;
            } else if (first[mid] > data) {
                end = mid - 1;
            } else if (first[mid] < data) {
                start = mid + 1;
            }
        }
        return false;
    }
}
