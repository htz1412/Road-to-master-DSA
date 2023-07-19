/*
 * Problem Link : https://leetcode.com/problems/summary-ranges/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();

        if (nums.length < 1) {
            return list;
        }

        int start = 0;
        int end = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i] - 1) {
                list.add(getRange(nums, start, end));
                start = i;
            }
            end = i;
        }


        list.add(getRange(nums, start, end));
        return list;
    }

    public String getRange(int[] nums, int start, int end) {
        return nums[start] == nums[end] ? String.valueOf(nums[start]) : nums[start] + "->" + nums[end];
    }
}