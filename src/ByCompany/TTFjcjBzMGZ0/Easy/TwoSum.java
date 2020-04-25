package ByCompany.TTFjcjBzMGZ0.Easy;

// https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; map.put(nums[i], i++))
            if (map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
