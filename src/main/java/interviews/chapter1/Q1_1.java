package interviews.chapter1;

import java.util.HashMap;
import java.util.Map;

public class Q1_1 {
    public boolean isDuplicate(String text) {

        Map<Character, Boolean> m = new HashMap<>();
        for (char ch: text.toCharArray()) {
            if (m.containsKey(ch)) {
                return true;
            }
            m.put(ch, true);
        }

        return false;
    }
}
