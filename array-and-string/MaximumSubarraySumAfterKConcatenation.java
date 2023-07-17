/*
 * Problem Link : https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118820/offering/1381873
 */

import java.util.ArrayList;

public class MaximumSubarraySumAfterKConcatenation {
  public static long maxSubSumKConcat(ArrayList<Integer> arr, int n, int k) {
    long maxSum = Long.MIN_VALUE;
    long totalSum = 0l;
    long currentSum = 0l;

    for (int i = 0; i < n; i++) {
      totalSum += arr.get(i);
      currentSum += arr.get(i);
      maxSum = Math.max(currentSum, maxSum);
      currentSum = Math.max(0, currentSum);
    }

    if (k == 1) {
      return maxSum;
    }

    totalSum = Math.max(0, totalSum);
    currentSum = 0;
    maxSum = Long.MIN_VALUE;

    for (int i = 0; i < n * 2; i++) {
      currentSum += arr.get(i % n);
      maxSum = Math.max(currentSum, maxSum);
      currentSum = Math.max(0, currentSum);
    }

    return (totalSum * (k - 2)) + maxSum;
  }
}
