package com.bishal;
//https://leetcode.com/problems/transpose-matrix/

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix  = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        
        int [][] ans = transpose(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] ans =  new int[matrix[0].length][matrix.length]; //the no of column should be equal to no of rows and vice versa
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
    return ans;
    }
}
