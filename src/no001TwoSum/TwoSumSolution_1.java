package no001TwoSum;

/**
 * Created by Prophet on 2017/1/31.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution.
        Example:
            Given nums = [2, 7, 11, 15], target = 9,
            Because nums[0] + nums[1] = 2 + 7 = 9,
            return [0, 1].
    UPDATE (2016/2/13):
        The return format had been changed to zero-based indices. Please read the above updated description carefully.
 */
public class TwoSumSolution_1 implements TwoSumSolution{

    /**
     * O(n2) runtime, O(1) space – Brute force:
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int a = 0;
        int b = 1;
        boolean flag = false;
        for (a = 0; a < nums.length - 1; a++) {
            for (b = a + 1; b < nums.length; b++) {
                if ((nums[a] + nums[b]) == target) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        return new int[] {a, b};
    }
}
