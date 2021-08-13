package com.bishal;
import java.util.Scanner;

//2. Write a program to print whether a number is even or odd, also take input.

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to check if it is odd or even");
        int num = input.nextInt();
        int rem = num % 2;
        if(rem == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
