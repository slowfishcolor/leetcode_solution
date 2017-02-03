package no170TwoSumIII;

/**
 * Created by Prophet on 2017/2/2.
 * Design and implement a TwoSum class.
 * It should support the following operations: add and find.
 * add(input) – Add the number input to an internal data structure.
 * find(value) – Find if there exists any pair of numbers which sum is equal to the value.
 * For example, add(1); add(3); add(5); find(4)  true; find(7)  false
 */
public interface TwoSumIIISolution {
    // Add the number input to an internal data structure.
    void add(int input);
    // Find if there exists any pair of numbers which sum is equal to the value.
    boolean find(int val);
}
