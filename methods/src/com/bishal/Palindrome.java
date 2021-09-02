package com.bishal;
import java.util.Scanner;
//Write a function to find if a number if palindrome or not. Take number as parameter.

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if is palindrome or not::");
        int n = in.nextInt();
        isPalindrome(n);
    }

    private static void isPalindrome(int n) {
        int rev = 0, rem;
        int num = n;
        while(n>0) {
            rem = n % 10;
            rev = rev*10 + rem;
            n = n / 10;
        }
        System.out.println("The reverse of the number is: " + rev);
        if(rev == num) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}
