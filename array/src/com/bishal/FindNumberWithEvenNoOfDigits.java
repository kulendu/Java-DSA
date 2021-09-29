package com.bishal;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class FindNumberWithEvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int count = findNumbers(nums);
        System.out.println(count);
    }

    public static int findNumbers(int[] nums) {
        int count =0, digits = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            while (n > 0) {
                digits++;
                n = n/10;
            }
            if (digits % 2 == 0) {
                count ++;
            }
            digits = 0;
        }
        return count;
    }
}
