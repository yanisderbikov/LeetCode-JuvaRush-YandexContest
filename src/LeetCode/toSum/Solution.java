package LeetCode.toSum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int component = target - nums[i];
            if (map.containsKey(component)){
                return new int[]{map.get(component), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}