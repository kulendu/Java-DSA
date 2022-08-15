package com.bishal;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        System.out.println(greet());
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int add = a +b;

        System.out.println(add);
    }

    // Returning a string method
    static String greet() {
        String msg = "Hey welcome";
        return msg;
    }
}
