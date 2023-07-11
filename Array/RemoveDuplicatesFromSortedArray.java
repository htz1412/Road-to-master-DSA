/*
 * Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/?envType=study-plan-v2&envId=top-interview-150
 */

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    int lastUniqueIndex = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[lastUniqueIndex]) {
        nums[++lastUniqueIndex] = nums[i];
      }
    }

    return ++lastUniqueIndex;
  }
}
