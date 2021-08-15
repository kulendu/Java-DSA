package com.bishal;
import java.util.Objects;
import java.util.Scanner;

//5. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Calculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Enter the operator you want to perform: ");
        String op = input.next();

        if(op.equals("+")) {
            System.out.println(num1 + num2);
        } else if(op.equals("-")) {
            System.out.println(num1 - num2);
        } else if(op.equals("*")) {
            System.out.println(num1 * num2);
        } else if(op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Wrong operator entered!");
        }

    }
}
