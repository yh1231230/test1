package com.mytreeset;

//存储自定义类型

import java.util.TreeSet;

public class MyTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        Student s1 = new Student("z3",21);
        Student s2 = new Student("l4",22);
        Student s3 = new Student("w5",23);
        Student s4 = new Student("z6",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
