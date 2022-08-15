package com.bishal;

public class Shadowing {
    static int global_var = 10; // If not changed, the value will remain 10

    public static void main(String[] args) {
        System.out.println(global_var); // value is 10

        int global_var = 12; // This is overwritten with 12
        System.out.println(global_var);
    }
}
