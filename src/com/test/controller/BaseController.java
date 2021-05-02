package com.test.controller;

import com.test.domain.Student;

public interface BaseController {
    public void start();

    public void addStudent();

    public void deleteStudent();

    public String inputStudentId();

    public void queryStudent();

    public Student inputStudentInfo(String sid);

}
