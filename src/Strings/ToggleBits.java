package src.Strings;

import java.util.Scanner;

public class ToggleBits {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        int n = scanner.nextInt();

        int bits = Integer.toBinaryString(n).length();

        int mask = (1 << bits) - 1;

        int result = n ^ mask;

        System.out.println("The Number after toggling the result is : " + result);

    }
}
