package com.test.dao;

import com.test.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class OtherStudentDao implements BaseDao {
  static List<Student> stus=new ArrayList<>();



    static {
        Student s1=new Student("160577017","殷豪",22,"1201");
        Student s2=new Student("160577019","pt",22,"1227");
        stus.add(s1);
        stus.add(s2);
    }

    //新增数据
    public void addStudent(Student stu) {
       stus.add(stu);
    }


    //查看数据
    public Student[] queryStudent() {
        Student[] students= (Student[]) stus.toArray();
        return students;
    }

    //删除数据
    public void deleteStudent(String sid) {
        int index = getIndex(sid);
        if (index == -1) {
            System.out.println("学号输入错误");
        } else {
            stus.remove(index);
            System.out.println("删除成功");
        }
    }


    //获取索引
    public int getIndex(String sid) {
        int index = -1;

        for (int i = 0; i < stus.size(); i++) {
            Student student = stus.get(i);
            if (student != null && sid.equals(student.getSid())) {
                index = i;
                break;
            }
        }
        return index;
    }

    public Student[] findAllStudent() {

        return (Student[])stus.toArray();
    }

    public void updateStudent(String uid, Student nstu) {
        int index = getIndex(uid);
        stus.set(index,nstu);
    }
}
