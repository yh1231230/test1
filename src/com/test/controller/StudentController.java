package com.test.controller;

import com.test.domain.Student;
import com.test.service.StudentService;

import java.util.Scanner;

public class StudentController implements BaseController {
    StudentService studentService = new StudentService();

    //开启并展示菜单
    public void start() {
        StudentService studentService = new StudentService();

        Scanner scanner = new Scanner(System.in);
        lo:
        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("请输入您的选择：1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    queryStudent();
                    break;
                case "5":
                    ;
                    break lo;
                default:
                    System.out.println("输入错误！请重新输入！");
                    ;
                    break;
            }
        }
    }

    public void addStudent() {
        String sid;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            sid = sc.next();
            boolean flag = studentService.isExists(sid);
            if (flag) {
                System.out.println("学号已存在！");
            } else {
                break;
            }
        }
        //传递给Service
        studentService.addStudent(inputStudentInfo(sid));
        System.out.println("添加成功！");

    }

    public void deleteStudent() {
        studentService.deleteStudent(inputStudentId());
    }

    public void updateStudent() {
        String uid=inputStudentId();
        studentService.updateStudent(uid, inputStudentInfo(uid));
        System.out.println("修改成功！");
    }

    //检查id是否存在
    public String inputStudentId(){
        String id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.next();
            boolean exits = studentService.isExists(id);
            if (!exits) {
                System.out.println("学号不存在！");
            } else {
                break;
            }
        }
        return id;
    }

    //封装学生对象
    public Student inputStudentInfo(String sid){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();

        //封装学生对象
        Student student = new Student();
        student.setSid(sid);
        student.setName(name);
        student.setAge(age);
        student.setBirthday(birthday);
        return student;
    }

    //查询学生
    public void queryStudent() {
        Student[] students = studentService.queryStudent();
        if (students == null) {
            System.out.println("无信息，请添加后重试！");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if (s != null)
                System.out.println(s);
        }
    }

}
