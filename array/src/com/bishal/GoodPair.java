//Given an array of integers nums, return the number of good pairs.
//
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//
//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

package com.bishal;
import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] pairs = new int[6];
        System.out.println("Enter the array to find its number of pairs");
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = in.nextInt();
        }
        int num = getGoodPairs(pairs);
        System.out.println("No of good pairs: " + num);
    }

    private static int getGoodPairs(int[] pairs) {
        int count = 0;
        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < pairs.length; j++) {
                if(pairs[i] == pairs[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}
