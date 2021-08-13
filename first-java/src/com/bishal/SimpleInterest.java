package com.bishal;
import java.util.Scanner;

//4. Write a program to input principle, time and rate (P, T, R) from user and find Simple Interest.

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principle, rate and time period: ");
        double p = input.nextDouble();
        double r = input.nextDouble();
        double t = input.nextDouble();
        double simpleInterest = (p * r * t) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
