package com.example.helloworld;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        // Convert Celceius to Farenheit
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter temp. in C: ");

        float celcius = user_input.nextFloat();
//        float farenheit = user_input.nextFloat();

        float cel_to_far = (celcius * 9/5) + 32;

        System.out.println("Temp. in F is: " + cel_to_far);
    }
}
