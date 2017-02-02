package no167TwoSumII;

/**
 * Created by Prophet on 2017/1/31.
 */
public class TestTwoSumII {

    public static void main(String args[]) {
        TwoSumIISolution solution = new TwoSumIISolution_4();
        int[] result = solution.twoSum(new int[]{5,25,75}, 100);
        System.out.println(result[0] + ", " + result[1]);
    }

}
