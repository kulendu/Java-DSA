package com.bishal;
import java.util.Scanner;

//6.Take 2 numbers as input and print the largest number.

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to check which one is the largest: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is the largest");
        } else if (num1 < num2 ) {
            System.out.println(num2 + " is the largest");
        } else {
            System.out.println("Oops both the numbers are equal!");
        }
    }
}