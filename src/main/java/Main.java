package main.java;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class Main {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>(new OwnComparator());
        set.addAll(Arrays.asList(1, 7, 6, 4, 3, 8, 2, 9));
        System.out.println(set);
    }
}



