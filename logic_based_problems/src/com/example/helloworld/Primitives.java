package com.example.helloworld;

import java.util.Scanner;

public class Primitives {
    public static void main(String[] args){
        System.out.println("Enter the two numbers ");
        Scanner input = new Scanner(System.in);

        int num_one = input.nextInt();
        int num_two = input.nextInt();
        int sum = (num_one + num_two);

        System.out.println("The Sum of " + num_one + " and " + num_two + " is: " + sum);
    }
}
