package src.Sorting;

public class QuickSort {


    public static void main(String[] args) {
        int [] nums = {5,6,2,3,1,8,4};

        System.out.println("Quick Sort");
        System.out.println();
        System.out.println("Array before sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }


        quicksort(nums,0, nums.length - 1);


        System.out.println();
        System.out.println("Array after sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }
    }

    private static void quicksort(int[] nums, int low, int high) {

        if (low < high) {
            int pi = partition(nums, low, high);
            quicksort(nums, low, pi - 1);
            quicksort(nums, pi + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {

        int pivot = nums[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}
