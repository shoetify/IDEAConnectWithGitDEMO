package StudentManageSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            output();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    delStudent();
                    break;
                case 3:
                    break;
                case 4:
                    checkStudent();
                    break;
                case 5:
                    System.out.println("谢谢您的使用，再见！");
                    System.exit(0);
                default:
                    System.out.println("输入错误，请再次输入");
            }
        }

    }

    public static void output(){
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生");
        System.out.println("4. 查看所有学生");
        System.out.println("5. 退出");
        System.out.println("请输入您的选择： ");
    }

    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        String sid,name,address,age;
        System.out.println("请输入学生学号");
        sid = sc.nextLine();
        stu.setSid(sid);
        System.out.println("请输入学生姓名");
        name = sc.nextLine();
        stu.setName(name);
        System.out.println("请输入学生年龄");
        age = sc.nextLine();
        stu.setAge(age);
        System.out.println("请输入学生地址");
        address = sc.nextLine();
        stu.setAddress(address);

        students.add(stu);

    }

    public static void delStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号");
        String sid = sc.nextLine();
        for (int i = 0; i<students.size(); i++) {
            if (sid.equals(students.get(i).getSid())) {
                students.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("删除失败，未找到该学生");
    }

    public static void checkStudent(){
        System.out.println("学号\t姓名\t年龄\t居住地");
        for (int i=0; i<students.size(); i++) {
            System.out.print(students.get(i).getSid()+"\t");
            System.out.print(students.get(i).getName()+"\t");
            System.out.print(students.get(i).getAge()+"\t");
            System.out.print(students.get(i).getAddress()+"\t");
            System.out.println();
        }
    }
}
