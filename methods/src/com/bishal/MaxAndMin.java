package com.bishal;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        findMax(num1, num2, num3);
        findMin(num1, num2, num3);


    }
    static void findMax(int x, int y, int z) {
        if (x > y && x > z) {
            System.out.println(x + " is the largest");
        }
        if (y > z && y > x) {
            System.out.println(y + " is the largest");
        }
        if (z > x && z > y) {
            System.out.println(z + " is the largest");
        }
    }

    static void findMin(int x, int y, int z) {
        if (x < y && x < z) {
            System.out.println(x + " is the smallest");
        }
        if (y < z && y < x) {
            System.out.println(y + " is the smallest");
        }
        if (z < x && z < y) {
            System.out.println(z + " is the smallest");
        }
    }


}
