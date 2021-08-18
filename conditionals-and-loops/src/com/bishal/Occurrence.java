package com.bishal;
import java.util.Scanner;

//To find the occurrence of a number

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check for the occurrence: ");
        int num = input.nextInt();
        System.out.println("Enter the number whose occurrence you want to check: ");
        int n = input.nextInt();
        int rem, count = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem == n) {
                count++;
            }
            num /= 10;
        }
        System.out.println("The occurrence of the number 7 is: " + count);
    }
}
