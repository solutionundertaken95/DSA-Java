package src.Search;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {2, 4, 6, 8, 10, 12, 34};
        int [] arr2 = {56,54,40,30,15,8,6,2};

        int target = 40;

        int index = binarySearch(arr2, target);
        if (index == -1) {
            System.out.println("Target Not Found");
        } else
            System.out.println("Target found at index : " + index);

    }

    private static int binarySearch(int[] arr, int target) {

        int start = 0;

        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}

