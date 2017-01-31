package no1TwoSum;

/**
 * Created by Prophet on 2017/1/31.
 */
public class TwoSolutionTest {
    public static void main(String args[]) {
        TwoSumSolution solution = new TwoSumSolution_3();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 27}, 9);
        System.out.println(result[0] + ", " + result[1]);
    }
}
