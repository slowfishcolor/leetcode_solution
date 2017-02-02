package no167TwoSumII;

/** Brute Force: double for - TLE
 * Created by Prophet on 2017/1/31.
 */
public class TwoSumIISolution_1 implements TwoSumIISolution {
    /**
     * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
     * <p>
     * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
     * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
     * You may assume that each input would have exactly one solution and you may not use the same element twice.
     * Input: numbers={2, 7, 11, 15}, target=9
     * Output: index1=1, index2=2
     *
     * @param nums
     * @param target
     * @return
     */
    @Override
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i + 1, j + 1};
                if (nums[j] >= target) break;
            }
        }
        throw new IllegalArgumentException("");
    }
}
