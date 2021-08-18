package com.bishal;
import java.util.Scanner;

//to find the reverse of a number

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find its reverse: ");
        int num = in.nextInt();
        int rev = 0, rem;

        while (num > 0) {
            rem = num % 10;
            num /= 10;
            rev = rev * 10 + rem;
        }
        System.out.println("Reverse: " + rev);
    }
}
