package com.mytreeset;

import java.util.TreeSet;

public class MyTreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(1);

        System.out.println(ts);
    }
}
