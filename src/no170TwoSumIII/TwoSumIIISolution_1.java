package no170TwoSumIII;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Prophet on 2017/2/2.
 */
public class TwoSumIIISolution_1 implements TwoSumIIISolution {

    Map<Integer, Integer> map = new HashMap<>();

    @Override
    public void add(int input) {
        int count = map.containsKey(input) ? map.get(input) : 0;
        map.put(input, count + 1);
    }

    @Override
    public boolean find(int val) {
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int num = entry.getKey();
            int y = val - num;
            if (y == num) {
                // For duplicates, ensure there are at least two individual numbers;
                if (entry.getValue() >= 2) return true;
            } else if (map.containsKey(y)) {
                return true;
            }
        }
        return false;
    }
}
