package com.bishal;

import java.util.Map;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. to be checked: ");
        int n = in.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);
    }

    static boolean isArmstrong(int n) {
        int rem, sum = 0, cube, ans;
        int original = n;

        while (n > 0){
            rem = n % 10;
            n = n/10;
            cube = (int) Math.pow(rem, 3);
            sum = sum + cube;
        }

        if (original == sum) {
            return true;
        }
        return false;
    }


}
