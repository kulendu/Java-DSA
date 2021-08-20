package com.bishal;
import java.util.Scanner;

//Program to reverse a string

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder rev = new StringBuilder();
        char ch;
        System.out.println("Enter a string to print its reverse");
        String str = input.next();
        int len = str.length();
        for(int i=len; i>0; i--) {
            int index = 0;
            ch = str.trim().charAt(i-1);
            rev.append(ch);
            ++index;
        }
        System.out.println("Reverse: " + rev);
    }
}
