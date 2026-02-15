package src.Search;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {

    public static int binarySearch(int arr[], int target){

        int left=0;
        int right = arr.length-1;


        while(left <= right){

            int mid = (left + right)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid +1 ;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] num = {2,4,6,8,10};
        int target = 4;
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Binary Search\n");

        int index = binarySearch(num,target);
        if(index == -1){
            System.out.println("Target not present in the list");
        }
        else
            System.out.println("Target present at position : " +index);
    }
}