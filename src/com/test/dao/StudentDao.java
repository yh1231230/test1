package com.test.dao;

import com.test.domain.Student;

public class StudentDao {
     static Student[] stus = new Student[5];

    //新增数据
    public void addStudent(Student stu) {
        int index = -1;
        int i = 0;
        for (; i < stus.length; i++) {
            Student student = stus[i];
            if (student == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            stus[index] = stu;
        }else {
            Student[] newArray = new Student[stus.length + (stus.length >> 1)];
            System.arraycopy(stus, 0, newArray, 0, stus.length);
            stus = newArray;
            stus[i]=stu;
        }
    }


    //查看数据
    public Student[] queryStudent() {
        return stus;
    }

    //删除数据
    public void deleteStudent(String sid) {
        int index = getIndex(sid);
        if (index == -1) {
            System.out.println("学号输入错误");
        } else {
            stus[index] = null;
            System.out.println("删除成功");
        }
    }


    //获取索引
    public int getIndex(String sid) {
        int index = -1;

        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && sid.equals(student.getSid())) {
                index = i;
                break;
            }

        }
        return index;
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public void updateStudent(String uid, Student nstu) {
        int index = getIndex(uid);
        stus[index] = nstu;
    }
}
