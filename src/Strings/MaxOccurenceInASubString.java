package src.Strings;

import java.util.Scanner;

public class MaxOccurenceInASubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string");
        String string = scanner.nextLine();
        System.out.println("Enter the number of substrings");
        int n = scanner.nextInt();
        int max =0, count =0;
        for(int i=0; i<string.length();i++){
            if( i%n == 0){
                max = Math.max(max,count);
                count = 0;
            }
            if(string.charAt(i) == 'a'){
                count ++;
            }
        }

        max = Math.max(max,count);
        System.out.println("Max Occurence of a's are : " +max);
    }
}
