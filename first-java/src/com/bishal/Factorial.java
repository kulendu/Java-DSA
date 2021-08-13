package com.bishal;
import java.util.Scanner;

//1. Write a program to print factorial of a number, also take input.


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial for: ");
        int num = input.nextInt();
        int fac = 1;
        for(int i=num; i>=1; i--) {
            fac = fac * i;
        }
        System.out.println("Factorial= " + fac);
    }
}
