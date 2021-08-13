package com.bishal;
import java.util.Scanner;

//3. Take name as input and print a greeting message for that name.
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name + ", nice to meet you!");
    }
}

