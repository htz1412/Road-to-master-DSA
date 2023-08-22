/*
 * Problem Link : https://leetcode.com/problems/set-matrix-zeroes/
 */

class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        boolean setZeroInFirstCol = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (j == 0) {
                        setZeroInFirstCol = true;
                        matrix[i][0] = 0;
                    } else {
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }
                }
            }
        }

        for (int col = 1; col < matrix[0].length; col++) {
            if (matrix[0][col] == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][col] = 0;
                }
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][0] == 0) {
                for (int j = 0; j < matrix[row].length; j++) {
                    matrix[row][j] = 0;
                }
            }
        }

        if (setZeroInFirstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}