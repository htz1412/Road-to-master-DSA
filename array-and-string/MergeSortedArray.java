/*
 * Problem Link : https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
 */

public class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int high1 = m - 1;
    int high2 = n - 1;
    int k = m + n - 1;

    while (high2 >= 0) {
      if (high1 < 0 || nums1[high1] <= nums2[high2]) {
        nums1[k--] = nums2[high2--];
      } else {
        nums1[k--] = nums1[high1--];
      }
    }
  }
}