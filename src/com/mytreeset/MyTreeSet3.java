package com.mytreeset;

//存储自定义类型

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet3 {
    public static void main(String[] args) {
        TreeSet<Teacher> ts=new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result=o1.getAge()-o2.getAge();
                result=result==0?o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        Teacher s1 = new Teacher("z3",21);
        Teacher s2 = new Teacher("l4",22);
        Teacher s3 = new Teacher("w5",23);
        Teacher s4 = new Teacher("z6",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
