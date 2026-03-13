package src.Arrays;

public class LargestElement {

    public static void main(String[] args) {

        int [] arr = {8,3,7,4,2,5,6};

        int largest = 0;

        for (int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        System.out.println("Largest is : " + largest);
    }
}
