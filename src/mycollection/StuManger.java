package mycollection;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManger {
    //搭建主界面
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {
            System.out.println("---------学生管理系统---------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");
            String c = sc.next();
            switch (c) {
                case "1":
                    // System.out.println("添加学生");
                    addStudent(list);
                    break;
                case "2":
                    // System.out.println("删除学生");
                    deleteStudent(list);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    queryStudent(list);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    break lo;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }


    }

    //查看的方法
    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无信息，请添加后查询！");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (Student student : list
        ) {
            System.out.println(student);
        }

    }

    //添加的方法
    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.next();
            int index = getIndex(list, sid);
            if (index == -1) {
                break;
            }else {
                System.out.println("学号已存在，请重新输入！");
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入生日：");
        String birthday = sc.next();
        Student student = new Student(sid, name, age, birthday);
        list.add(student);
        System.out.println("添加成功！");

    }

    //删除的方法
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");
        String sid = sc.next();
        int index = getIndex(list, sid);
        if (index == -1) {
            System.out.println("学号不存在！");
        } else {
            list.remove(index);
            System.out.println("删除成功！");
        }
    }

    //修改的方法
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号：");
        String sid = sc.next();
        int index = getIndex(list, sid);
        if (index == -1) {
            System.out.println("学号错误！");
        } else {
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            System.out.println("请输入生日：");
            String birthday = sc.next();
            Student student = new Student(sid, name, age, birthday);
            list.set(index, student);
            System.out.println("修改成功！");
        }
    }

    //查找索引值
    public static int getIndex(ArrayList<Student> list, String sid) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            String id = student.getSid();
            if (sid.equals(id)) {
                index = i;
            }
        }
        return index;
    }


}
