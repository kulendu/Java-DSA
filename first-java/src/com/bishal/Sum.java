package com.bishal;
import java.util.Scanner;

//9.Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers to keep adding and 0 to stop: ");
        int num = input.nextInt();
        sum += num;
        while(num != 0) {
            System.out.println("Enter numbers to keep adding and 0 to stop: ");
            num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }
}
