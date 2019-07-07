package main.java;

import java.util.Comparator;

public class OwnComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0) {
            if (o2 % 2 == 0) {
                return o1.compareTo(o2);
            } else {
                return -1;
            }
        } else {
            if (o2 % 2 != 0) {
                return o1.compareTo(o2);
            } else {
                return 1;
            }
        }
    }
}
