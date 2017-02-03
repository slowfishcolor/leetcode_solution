package no28ImplementStrstr;

/**
 * Created by Prophet on 2017/2/3.
 */
public class ImplementStrStrSolution_1 implements ImplementStrStr {
    @Override
    public int strStr(String haystack, String needle) {
        if (haystack.equals(needle)) return 0;
        char[] hayChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        boolean flag = true;
        for (int i = 0; i <= hayChars.length - needleChars.length; i++) {
            flag = true;
            for (int j = 0; j < needleChars.length; j++) {
                if (needleChars[j] != hayChars[i + j]) flag = false;
            }
            if (flag) return i;
        }
        return -1;
    }
}
