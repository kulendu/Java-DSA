package com.bishal;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check for prime: ");
        int num = in.nextInt();
        checkPrime(num);
    }
    static void checkPrime(int n) {
        int flag = 0, rem;
        for(int i=2; i<=n/2; i++) {
            rem = n%i;
            if (rem == 0) {
                flag = 1;
                break;
            }
        }
        if(flag == 1) {
            System.out.println("The number is not prime");
        } else {
            System.out.println("The number is prime");
        }
    }
}
