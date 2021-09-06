//Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

package com.bishal;
import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Enter wealth of customers: ");
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = in.nextInt();
            }

        }
        getRichestCustomerWealth(arr);
    }

     static void getRichestCustomerWealth(int[][] arr) {
        int max = 0, sum = 0;
         for (int i = 0; i <arr.length ; i++) {
             sum = 0;
             for (int j = 0; j <arr[i].length ; j++) {
                 sum += arr[i][j];
             }
         if(sum >= max) {
             max = sum;
         }

     }
         System.out.println("Maximum wealth: " + max);
    }
}
