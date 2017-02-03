package no001TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * from clean code handbook
 * Created by Prophet on 2017/1/31.
 */
public class TwoSumSolution_3 implements TwoSumSolution {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * You may assume that each input would have exactly one solution.
     * <p>
     * Example:
     * Given nums = [2, 7, 11, 15], target = 9,
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     * UPDATE (2016/2/13):
     * The return format had been changed to zero-based indices. Please read the above updated description carefully.
     *
     * @param nums
     * @param target
     * @return
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) return new int[]{map.get(target - x), i};
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
