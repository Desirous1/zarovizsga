package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        Set<Integer> list = new HashSet<>();
        for (char oi : s.toCharArray()) {
            try {
                int part = Character.getNumericValue(oi);
                list.add(part);
            } catch (NumberFormatException nf) {
            }
        }
        return list.size();
    }
}
