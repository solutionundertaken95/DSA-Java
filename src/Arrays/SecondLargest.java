package src.Arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {8,3,9,4,2,5,6};

        int largest = arr[0];
        int slarge = Integer.MIN_VALUE;

        for (int i =0;i<arr.length;i++){

            if(arr[i]> largest){
                slarge = largest;
                largest = arr[i];
            }

            else if( arr[i] > slarge && arr[i] != largest){
                slarge = arr[i];
            }
        }

        System.out.println("Second Largest is : " + slarge);
    }
}