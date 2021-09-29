package com.bishal;
//https://leetcode.com/problems/matrix-diagonal-sum/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum = matrixDiagonalSum(mat);
        System.out.println(sum);
    }

    private static int matrixDiagonalSum(int[][] mat) {
        int sum = 0;
        int index = mat[0].length - 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }
        //System.out.println(sum);
        //for secondary diagonal
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][index];
            if (i == index) {
                sum -= mat[i][index];
            }
            index --;
        }
        return sum;
    }
}
