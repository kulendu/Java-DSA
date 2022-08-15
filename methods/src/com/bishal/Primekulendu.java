package com.bishal;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Primekulendu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ot be checked: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
