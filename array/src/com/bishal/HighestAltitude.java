package com.bishal;
//https://leetcode.com/problems/find-the-highest-altitude/


public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int highest = findHighestAltitude(gain);
        System.out.println(highest);
    }

    private static int findHighestAltitude(int[] gain) {
        int[] altitudes = new int[gain.length + 1];
        for (int i = 0; i < gain.length; i++) {
          altitudes[i+1] = altitudes[i] + gain[i];
        }
        int max = altitudes[0];
        for (int i = 0; i < altitudes.length; i++) {
            if(altitudes[i] > max) {
                max = altitudes[i];
            }
        }
        return max;
    }
}
