package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> chars = new HashSet<>();
        for (char oi : s.toCharArray()) {
            if (Character.isDigit(oi)) {
                chars.add(oi);
            }
        }
        return chars.size();
    }
}
