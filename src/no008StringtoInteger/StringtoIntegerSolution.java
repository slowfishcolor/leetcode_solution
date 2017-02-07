package no008StringtoInteger;

/**
 * Created by Prophet on 2017/2/7.
 */
public class StringtoIntegerSolution {

    private static final int maxdiv10 = Integer.MAX_VALUE / 10;

    public int myAtoi(String str) {
        int i = 0;
        int n = str.length();
        while(i < n && Character.isWhitespace(str.charAt(i))) i++;

        int sign = 1;
        if (i < n && str.charAt(i) == '+') {
            i++;
        } else if (i < n && str.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        int num = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = Character.getNumericValue(str.charAt(i));
            if (num > maxdiv10 || (num == maxdiv10 && digit >= 8)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return sign * num;
    }
}
