package com.bishal;
import java.util.Scanner;

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
