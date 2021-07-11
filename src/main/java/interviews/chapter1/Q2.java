package interviews.chapter1;

import java.util.Arrays;

public class Q2 {
    public boolean isSameSort(String t1, String t2) {
        if (t1.length() != t2.length()) {
            return false;
        }

        return sort(t1).equals(sort(t2));
    }

    private String sort(String text) {
        char[] t = text.toCharArray();
        Arrays.sort(t);

        return Arrays.toString(t);
    }
}
