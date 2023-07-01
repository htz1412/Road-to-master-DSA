/*
 * Problem Link : https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381874
 */

import java.util.*;
import java.io.*;

public class MaximumSumRectangle {
    public static int maxSumRectangle(int[][] arr, int n, int m) {
        int maxSum = Integer.MIN_VALUE;
        int[] total = new int[n];
        int sum = 0;

        for (int col = 0; col < m; col++) {
            Arrays.fill(total, 0);
            for (int k = col; k < m; k++) {
                sum = 0;
                for (int row = 0; row < n; row++) {
                    total[row] += arr[row][k];
                    sum += total[row];
                    maxSum = Math.max(sum, maxSum);
                    sum = Math.max(0, sum);
                }
            }
        }

        return maxSum;
    }
}
