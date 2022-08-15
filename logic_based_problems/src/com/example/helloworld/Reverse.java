package com.example.helloworld;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no to be reversed: ");

        int number = in.nextInt();
        int rem = in.nextInt();
        int ans = 0;

        while(number>0){
            rem = number % 10;
            number /= 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
