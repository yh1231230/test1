package com.mytreeset;

public class Student implements  Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //返回值为负数存左边，返回值为0则重复不存，返回值为正数存右边
        //按照年龄排序
        int result=this.age-o.age;

        //次要判断条件
        //年龄一样时通过字符串的compareTo方法比较姓名是否也一样
        result= result==0 ?this.name.compareTo(o.getName()):result;
        return result;
    }
}
