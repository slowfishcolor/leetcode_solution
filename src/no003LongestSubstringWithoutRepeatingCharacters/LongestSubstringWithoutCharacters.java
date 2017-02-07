package no003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Created by Prophet on 2017/2/7.
 */
public class LongestSubstringWithoutCharacters {
    public int lengthOfLongestSubstring(String s) {

        int num = 0;

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length() - num; i++) {
            int count = 0;
            set.clear();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                set.add(s.charAt(j));
                count++;
            }
            if (count > num) num = count;
        }

        return num;
    }
}
