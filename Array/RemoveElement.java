/*
 * Problem Link : https://leetcode.com/problems/remove-element/description/
 */

public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int count = 0;
    int end = nums.length - 1;
    int i = 0;

    while (i <= end) {
      if (nums[i] == val) {
        nums[i] = nums[end];
        nums[end--] = 0;
        count++;
      } else {
        i++;
      }
    }

    return nums.length - count;
  }

  // Simplified code from solution tab
  public int removeElementSolution(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}
