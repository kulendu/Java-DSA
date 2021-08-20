package com.bishal;
import java.util.Scanner;

//Subtract the Product and Sum of Digits of an Integer

public class SubtractOfProductAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, product = 1, rem, ans;
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        while (num >= 1) {
              rem = num % 10;
              sum += rem;
              product *= rem;
              num = num / 10;
        }
         ans = product - sum;
        System.out.println("Subtraction of product and sum of the digits of the integer is: " + ans);
    }
}
