package no151ReverseWordsInaString;

/**
 * Created by Prophet on 2017/2/3.
 */
public class ReverseWordsinStringSolution_1 implements ReverseWordsinString {
    @Override
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("")) continue;
            buffer.append(strings[i]);
            if (i != 0) buffer.append(" ");
        }
        return buffer.toString().trim();
    }
}
