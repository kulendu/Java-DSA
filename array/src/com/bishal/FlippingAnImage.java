package com.bishal;
//https://leetcode.com/problems/flipping-an-image/

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(arr));
        int [][] ans = flipImage(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + "    ");
            }
            System.out.println();
        }

    }

    private static int[][] flipImage(int[][] arr) {
        int[][] img = new int[arr.length][arr[0].length];
        //reversing the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                img[i][j] = arr[i][arr[i].length - j - 1];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                img[i][j] = img[i][j] == 1 ? 0 : 1;
            }

        }
        return img;
    }
}
