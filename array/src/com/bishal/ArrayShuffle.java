//Input: nums = [2,5,1,3,4,7], n = 3
//        Output: [2,3,5,4,1,7]
//        Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter an array to shuffle: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter tha value of n: ");
        int n = in.nextInt();
        arr = arrayShuffle(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayShuffle(int[] arr ,int n) {
       int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length/2; i++) {
            ans[2*i] = arr[i];
        }
        for (int i = 0; i < arr.length/2; i++) {
            ans[2*i + 1] = arr[arr.length/2 + i];
        }
        return ans;
    }
}
