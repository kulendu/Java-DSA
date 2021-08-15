package com.bishal;
import java.util.Scanner;

//7. Input a number and print all the factors of that number (use loops).

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to display its factorial: ");
        int num = input.nextInt();
        System.out.println("The factorials of the number are: ");
        for(int i=1; i<= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
