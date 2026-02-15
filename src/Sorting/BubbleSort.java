package src.Sorting;



public class BubbleSort {
    public static void main(String[] args) {

        int[] num = {6,2,8,3,5,9,1};

        System.out.println("Bubble Sort\n");
        System.out.println("Array before sorting : \n");
        for(int i =0;i< num.length;i++){
            System.out.print(num[i] +" ");

        }

        int [] sorted = bubbleSort(num);
        System.out.println("\n");
        System.out.println("Array after sorting : \n");
        for(int i =0;i< sorted.length;i++){
            System.out.print(sorted[i] + " ");

        }

    }

    public static int[] bubbleSort(int[] arr){
        int temp;
        int count = 0;
        for (int i=0;i< arr.length;i++){
            for(int j=0;j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count ++;
                }
            }

        }
        System.out.println();
        System.out.println("Number of steps : "+ count);
        return  arr;
    }
}
