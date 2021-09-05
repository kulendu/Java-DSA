//Input: nums = [0,2,1,5,3,4]
//        Output: [0,1,2,4,5,3]
//        Explanation: The array ans is built as follows:
//        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
//        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
//        = [0,1,2,4,5,3]

package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter an array of numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        arr= arrayFromPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

     static int[] arrayFromPermutation(int[] arr) {
        int[] ans = new int[6];
         for (int i = 0; i < arr.length; i++) {
             ans[i] = arr[arr[i]];
         }
         return ans;
    }
}
