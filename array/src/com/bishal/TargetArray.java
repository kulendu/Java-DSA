//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//        Output: [0,4,1,3,2]
//        Explanation:
//        nums       index     target
//        0            0        [0]
//        1            1        [0,1]
//        2            2        [0,1,2]
//        3            2        [0,1,3,2]
//        4            1        [0,4,1,3,2]

package com.bishal;
import java.util.Arrays;
import java.util.Scanner;

public class TargetArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        int [] index = new int[nums.length];
        int [] target = new int[nums.length];
        System.out.println("Enter the values for the nums array(5): ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println("Enter the values for the index array: ");
        for (int i = 0; i < index.length; i++) {
            index[i] = in.nextInt();
        }
        target = getTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

    private static int[] getTargetArray(int[] nums, int[] index) {
        int [] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int indx = index[i];
         if(index[i] < i) {
             for (int j = i; j>indx; j--) {
                 target[j] = target[j-1];
             }
         }
         target[index[i]] = nums[i];
        }
        return target;
    }
}
