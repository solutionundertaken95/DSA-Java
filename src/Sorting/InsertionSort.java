package src.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] nums = {5,6,2,3,1,8,4};
        System.out.println("Insertion Sort");
        System.out.println();
        System.out.println("Array before sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }

        for(int i=1;i< nums.length;i++){

            int key = nums[i];
            int j = i-1;

            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;


        }


        System.out.println();
        System.out.println("Array after sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }
    }
}
