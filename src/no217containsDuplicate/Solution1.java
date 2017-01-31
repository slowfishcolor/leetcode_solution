package no217containsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prophet on 2016/12/2.
 */
public class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) {
            if (set.contains(i)) return true;
            set.add(i);
        }
        return false;
    }
}
