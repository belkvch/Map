package ex3;

import java.util.*;

class CompStringReverse implements Comparator<String> {
    public int compare(String а, String b) {
        String aStr, bStr;
        aStr = а;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}
