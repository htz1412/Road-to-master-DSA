/*
 * Problem Link : https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }

    // found solution using sliding window approach from solution tab, but not so optimal than above approach.
    public boolean containsNearbyDuplicateUsingSlidingWindow(int[] nums, int k) {
        if (k == 0) return false;
        Set<Integer> slidingWindow = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (slidingWindow.contains(nums[i])) return true;

            if (i >= k)
                slidingWindow.remove(nums[i - k]);
            slidingWindow.add(nums[i]);
        }
        return false;
    }
}
