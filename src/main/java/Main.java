package main.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet set = new TreeSet<>(new OwnComparator());
        set.addAll(Arrays.asList(1, 7, 8, 6, 4, 3, 2, 9));
        System.out.println(set);
    }
}



