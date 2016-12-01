package no383ransomNote;

/**
 * Created by Prophet on 2016/12/1.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int rl = ransomNote.length();
        char[] rChar = ransomNote.toCharArray();
        char[] mChar = magazine.toCharArray();
        boolean flag = false;
        for (char c: rChar) {
            flag = false;
            for (int i = 0; i < mChar.length; i++) {
                if (c == mChar[i]) {
                    flag = true;
                    mChar[i] = 0;
                    break;
                }
            }
            if (!flag) return false;
        }
        return true;
    }
}
