package no1TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * O(n) runtime, O(n) space – Hash table:
 * We could reduce the runtime complexity of looking up a value to O(1) using a hash map that maps a value to its index.
    public
 * Created by Prophet on 2017/1/31.
 */
public class TwoSumSolution_2 implements TwoSumSolution {
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
            map.put(nums[i], i);
        }
        int a = 0;
        int b = 0;
        for (a = 0; a < nums.length; a++) {
            if ((map.get(target - nums[a]) != null) && (map.get(target - nums[a]) != a)) {
                b = map.get(target - nums[a]);
                break;
            }
            if (b != 0) break;
        }
        return new int[]{a, b};
    }
}
