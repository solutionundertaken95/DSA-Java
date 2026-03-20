package src.Strings;

import java.util.Scanner;

public class NumberOfSundays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting Day");
        String mon = scanner.nextLine();

        System.out.println("Enter the number of days from the start day");
        int n = scanner.nextInt();

        String [] arr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        boolean found =false;
        int i=0;

        for(i=0;i< arr.length;i++){
            if(mon.equals(arr[i])){
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Invalid Input Month");
            return;
        }


        int count = 0;

// days to first Sunday
        int daysToSunday = (6 - i + 7) % 7;

// If first Sunday is within range
        if (n > daysToSunday) {
            count = 1 + (n - daysToSunday - 1) / 7;
        }

        System.out.println("The Number of Sundays are : " + count);
    }
}
