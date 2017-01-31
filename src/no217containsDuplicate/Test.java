package no217containsDuplicate;

/**
 * Created by Prophet on 2016/12/2.
 */
public class Test {
    public static void main(String args[]) {
        Solution s = new Solution();
        boolean result = s.containsDuplicate(new int[]{1, 2, 3, 3});
        System.out.println(result);

        Solution1 s1 = new Solution1();
        boolean result1 = s.containsDuplicate(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }


}
