package com.bishal;

import java.util.Scanner;

public class FunctionParams {
    public static void main(String[] args) {
        int ans = mul(12, 2);
        System.out.println(ans);
    }

    static int mul(int a, int b) {
        int res = a * b;

        return res;
    }
}
