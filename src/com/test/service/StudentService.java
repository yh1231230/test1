package com.test.service;


import com.test.dao.BaseDao;
import com.test.dao.StudentDao;
import com.test.domain.Student;
import com.test.factory.StudentDaoFactory;


public class StudentService {
    private BaseDao studentDao = StudentDaoFactory.getStudentDao();

    public void addStudent(Student stu) {
        studentDao.addStudent(stu);
    }

    public void deleteStudent(String sid) {
        studentDao.deleteStudent(sid);
    }

    public Student[] queryStudent() {
        Student[] students = studentDao.queryStudent();
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student != null) {
                flag = true;
                break;
            }
        }

        if (flag) {
            return students;
        } else {
            return null;
        }
    }

    public int getIndex(String sid) {
        return studentDao.getIndex(sid);
    }

    public void updateStudent(String uid,Student nstu){
        studentDao.updateStudent(uid,nstu);
    }

    public boolean isExists(String sid) {
        Student[] students = studentDao.findAllStudent();
        boolean exists = false;
        for (Student student : students) {
            if (student != null && sid.equals(student.getSid())) {
                exists = true;
                break;
            }
        }
        return exists;
    }

}
