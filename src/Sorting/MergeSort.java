package src.Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int [] nums = {5,6,2,3,1,8,4};

        System.out.println("Merge Sort");
        System.out.println();
        System.out.println("Array before sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }


        mergeSort(nums,0, nums.length - 1);


        System.out.println();
        System.out.println("Array after sorting : ");
        for( int num : nums){
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] nums, int l, int r) {

        int mid = l+r/2;

        if(l<r){
            mergeSort(nums,l,mid);
            mergeSort(nums, mid+1,r);

            merge(nums,l,r,mid);
        }
    }

    private static void merge(int[] nums, int l, int r, int mid) {
        int n1 = mid - l + 1;

        int n2 = r - mid;

        int i=0;
        int j=0;
        int k=0;

        int [] larr = new int[n1];
        int[] rarr = new int[n2];

        for(int x=0;x<n1;x++){
            larr[x] = nums[l + x];
        }

        for(int y=0;y<n2;y++){
            rarr[y] = nums[mid + 1 + y];
        }

        while(i< n1 && j<n2){
            if(larr[i]<=rarr[j]){
                nums[k] = larr[i];
                i++;
            }

            else {
                nums[k] = rarr[j];
                j++;
            }
            k++;
        }

        //the leftovers in the 2 array can be added as such in the array because the numbers left are anyways greater
        while(i<n1){
            nums[k] = larr[i];
            i++;
            k++;
        }

        while(j<n2){
            nums[k] = rarr[j];
            j++;
            k++;
        }
    }

//This goes on dividing the array until it becomes single objcts then, we start merging them one by one
    //while merging the objects they will be in the form of arrays, so the first object from the first array is compared with the first object of the second array
    //if the first object is less, then it is added in the first position of the array else vice versa.



}
