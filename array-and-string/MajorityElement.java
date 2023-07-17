/*
 * Problem Link : https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    int n = nums.length;
    int maxCount = 0;
    int majorElement = nums[0];
    Map<Integer, Integer> occurrences = new HashMap<>();

    for (int i = 0; i < n; i++) {
      occurrences.put(nums[i], occurrences.getOrDefault(nums[i], 0) + 1);
      if (occurrences.get(nums[i]) > maxCount) {
        maxCount = occurrences.get(nums[i]);
        majorElement = nums[i];
      }
    }

    return majorElement;
  }

  // From solution tab
  public int majorityElementOptimalSolution(int[] nums) {
    int count = 0;
    int candidate = 0;

    for (int num : nums) {
      if (count == 0) {
        candidate = num;
      }

      if (num == candidate) {
        count++;
      } else {
        count--;
      }
    }

    return candidate;
  }
}