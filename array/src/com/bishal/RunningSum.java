//Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array to find its running sum:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr = runningSum(arr);
        System.out.println(Arrays.toString(arr));
    }

     static int[] runningSum(int[] arr) {
        int[] ans = new int[arr.length];
        int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j <= i; j++) {
                 ans[i] += arr[j];
             }
         }
         return ans;
    }
}
