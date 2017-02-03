package no125ValidPalindrome;

/**
 * Created by Prophet on 2017/2/3.
 */
public class ValidPalindromeSolution_1 implements ValidPalindromeSolution {
    @Override
    public boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        String trimS = s.replaceAll("[^a-z^A-Z^0-9]", "");
        String lowS = trimS.toLowerCase();
        int length = lowS.length();
        if (length <= 1) return true;
        for (int i = 0; i < length/2; i++) {
            if (lowS.charAt(i) != lowS.charAt(length - 1 - i)) return false;
        }
        return true;
    }
}
