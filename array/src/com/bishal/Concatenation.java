//Input: nums = [1,2,1]
//        Output: [1,2,1,1,2,1]
//        Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]

package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter an array to concatenate: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr = concatenate(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] concatenate(int[] arr) {
        int[] ans = new int[arr.length*2];

        for (int i = 0; i < arr.length*2; i++) {
            if(i >= arr.length ) {
                ans[i] = arr[i - arr.length];
            } else {
                ans[i] = arr[i];
            }
        }
        return ans;
    }
}
