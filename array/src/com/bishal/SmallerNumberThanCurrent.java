//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
//
//        Return the answer in an array.
//
//        Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]
//        Explanation:
//        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//        For nums[1]=1 does not exist any smaller number than it.
//        For nums[2]=2 there exist one smaller number than it (1).
//        For nums[3]=2 there exist one smaller number than it (1).
//        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumberThanCurrent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int[] ans = new int[nums.length];
        System.out.println("Enter the array:");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        ans = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count;
        for(int i=0; i<nums.length; i++) {
            count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    count ++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
