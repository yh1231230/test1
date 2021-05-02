package com.test.entry;

import com.test.controller.StudentController;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------欢迎使用信息管理系统----------");
            System.out.println("请输入您的选择：1.学生管理 2.教师管理 3.退出");
            String choice = scanner.next();
            switch (choice) {
                case "1":
                    StudentController studentController=new StudentController();
                    studentController.start();
                    break;
                case "2":
                    ;
                    break;
                case "3":
                    System.out.println("感谢您的使用！");
                    //退出当前虚拟机
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误！请重新输入！");
                    break;
            }
        }
    }
}
