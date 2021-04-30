package com.test.dao;

import com.test.domain.Student;

public interface BaseDao {
    void addStudent(Student student);

    Student[] queryStudent();

    void deleteStudent(String sid);

    int getIndex(String sid);

    Student[] findAllStudent();

    public abstract void updateStudent(String uid, Student nstu);
}
