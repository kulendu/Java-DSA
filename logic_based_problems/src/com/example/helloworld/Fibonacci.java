package com.example.helloworld;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Find the fibonacci series for the nth number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }

        System.out.println(b);
    }
}
