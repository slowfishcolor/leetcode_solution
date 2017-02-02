package no167TwoSumII;

/** Custom Binary Search
 * Created by Prophet on 2017/2/2.
 */
public class TwoSumIISolution_3 implements TwoSumIISolution {
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
        int t = 0;
        for(int i = 0; i < nums.length; i++) {
            t = binarySearch(nums, target - nums[i], i + 1);
            if (t >= 0) return new int[]{i + 1, t + 1};
        }
        throw new IllegalArgumentException();
    }

    private int binarySearch(int[] nums, int target, int start) {

        int L = start;
        int R = nums.length - 1;
        int M = 0;
        while (L <= R) {
            M = (L + R)/2;
            if (target == nums[M]) return M;
            if (target > nums[M]) L = M + 1;    // 1: M already test not the target. 2: keep moving when L == (L + M) / 2
            else R = M - 1;
        }
        return -1;
    }
}
