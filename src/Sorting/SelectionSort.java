package src.Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] num = {6,2,8,3,5,9,1};

        System.out.println("Selection Sort\n");
        System.out.println("Array before sorting : \n");
        for(int i =0;i< num.length;i++){
            System.out.print(num[i] +" ");

        }

        int [] sorted = selectionSort(num);
        System.out.println("\n");
        System.out.println("Array after sorting : \n");
        for(int i =0;i< sorted.length;i++){
            System.out.print(sorted[i] + " ");

        }

    }

    public static int[] selectionSort(int[] arr){
        int temp;
        int count = 0;
        for (int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                }
            }

        }
        System.out.println("Number of steps : "+ count);
        return  arr;
    }
}
