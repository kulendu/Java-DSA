//Input: candies = [4,2,1,1,2], extraCandies = 1
//        Output: [true,false,false,false,false]
//        Explanation: There is only 1 extra candy.
//        Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
package com.bishal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] candies = new int[3];
        ArrayList<Boolean> ans = new ArrayList<Boolean>(3);
        System.out.println("Enter the number of candies the kid has: ");
        for (int i = 0; i < candies.length; i++) {
            candies[i] = in.nextInt();
        }
        System.out.println("Enter the number of extra candies: ");
        int extra = in.nextInt();
        ans = findKidWithGreatestNoOfCandies(candies, extra);
        System.out.println(ans);
    }

     static ArrayList<Boolean> findKidWithGreatestNoOfCandies(int[] candies, int extra) {
        int max;
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
         max = candies[0] + extra;
         for (int i = 0; i < candies.length; i++) {
             if(max <= candies[i]) {
                 max = candies[i];
             }
         }
         for (int i = 0; i < candies.length; i++) {
             if(candies[i] + extra >= max) {
                 ans.add(true);
             } else {
                 ans.add(false);
             }
         }

         return ans;
    }
}
